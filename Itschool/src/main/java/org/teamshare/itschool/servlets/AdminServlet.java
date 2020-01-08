package org.teamshare.itschool.servlets;

import org.apache.commons.io.IOUtils;
import org.teamshare.itschool.services.CompanyService;
import org.teamshare.itschool.services.CourseService;
import org.teamshare.itschool.services.qualifiers.CompanyServiceQualifier;
import org.teamshare.itschool.services.qualifiers.CourseServiceQualifier;
import org.teamshare.itschool.servlets.dto.CourseDTO;
import org.teamshare.itschool.servlets.dto.HRManagerDTO;
import org.teamshare.itschool.servlets.dto.TeacherDTO;
import org.teamshare.itschool.utils.SerializeUtils;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.HttpMethodConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/admin/*")
@ServletSecurity(httpMethodConstraints = {
        @HttpMethodConstraint(value = "PUT", rolesAllowed = "admin")})
public class AdminServlet extends HttpServlet {
    @Inject
    @CourseServiceQualifier
    CourseService courseService;

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String relativeEndpoint = req.getRequestURI().substring("/admin/".length()).toLowerCase();
        String body = IOUtils.toString(req.getReader());
        Long result = null;

        switch (relativeEndpoint) {
            case "teachers":
                TeacherDTO teacherDTO = SerializeUtils.fromJson(body, TeacherDTO.class);
                result = courseService.addTeacher(teacherDTO);
                break;
            case "courses":
                CourseDTO courseDTO = SerializeUtils.fromJson(body, CourseDTO.class);
                result = courseService.addCourse(courseDTO);
                break;
        }
        resp.getWriter().println("{\"id\":" + result + "}");
    }
}
