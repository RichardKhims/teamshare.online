package org.teamshare.itschool.servlets;

import org.apache.commons.lang3.StringUtils;
import org.teamshare.itschool.services.CourseService;
import org.teamshare.itschool.services.qualifiers.CourseServiceQualifier;
import org.teamshare.itschool.utils.SerializeUtils;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/courses")
public class CourseServlet extends HttpServlet {
    @Inject
    @CourseServiceQualifier
    private CourseService courseService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String queryString = req.getQueryString();
            if (StringUtils.isEmpty(queryString)) {
                resp.getWriter().println(SerializeUtils.toJson(courseService.getCourses()));
            }
        } catch (Exception e) {
            resp.setStatus(500);
            resp.getWriter().println("Internal error");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
