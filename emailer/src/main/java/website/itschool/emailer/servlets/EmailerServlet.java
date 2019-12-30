package website.itschool.emailer.servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import website.itschool.emailer.services.EmailerService;
import website.itschool.emailer.services.EmailerServiceQualifier;
import website.itschool.emailer.servlets.dto.Subscription;
import website.itschool.emailer.utils.SerializeUtils;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class EmailerServlet extends HttpServlet {
    @Inject
    @EmailerServiceQualifier
    private EmailerService emailerService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String body = IOUtils.toString(req.getReader());
            Subscription subscription = SerializeUtils.fromJson(body, Subscription.class);

            if (req.getSession().getAttribute("subscription") == null) {
                req.getSession().setAttribute("subscription", subscription);
            }

            emailerService.send(subscription, (Subscription) req.getSession().getAttribute("subscription"));

            resp.getWriter().println("Success");
        } catch (Exception e) {
            resp.setStatus(500);
            resp.getWriter().println(e.getMessage());
        }
    }

    private Subscription fromSubmitedForm(HttpServletRequest req) {
        String course = req.getParameter("course");
        String contact = req.getParameter("contact");
        String level = req.getParameter("level");
        String text = req.getParameter("text");

        return new Subscription(course, level, contact, text);
    }
}
