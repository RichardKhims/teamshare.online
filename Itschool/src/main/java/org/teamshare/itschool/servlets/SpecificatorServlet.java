package org.teamshare.itschool.servlets;

import org.teamshare.specificator.services.SpecificatorService;
import org.teamshare.specificator.services.SpecificatorServiceQualifier;
import org.teamshare.specificator.utils.SerializeUtils;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class SpecificatorServlet extends HttpServlet {
    @Inject
    @SpecificatorServiceQualifier
    private SpecificatorService specificatorService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String responseBody = SerializeUtils.toJson(specificatorService.getSpecificators());
            resp.getWriter().println(responseBody);
        } catch (Exception e) {
            resp.setStatus(500);
            resp.getWriter().println("Internal error");
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
