package website.itschool.emailer.servlets;

import website.itschool.emailer.services.EmailerService;
import website.itschool.emailer.services.EmailerServiceQualifier;
import website.itschool.emailer.servlets.dto.Subscription;

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
            String course = req.getParameter("course");
            String contact = req.getParameter("contact");
            String level = req.getParameter("level");
            String text = req.getParameter("text");

            final Subscription subscription = new Subscription(course, level, contact, text);

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
}
