package org.teamshare.itschool.servlets;

import javafx.util.Pair;
import org.apache.commons.lang3.StringUtils;
import org.teamshare.itschool.services.StudentService;
import org.teamshare.itschool.services.qualifiers.StudentServiceQualifier;
import org.teamshare.itschool.utils.SerializeUtils;
import org.teamshare.itschool.utils.UrlUtils;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URISyntaxException;

@WebServlet("/students")
public class StudentServlet extends HttpServlet {
    @Inject
    @StudentServiceQualifier
    private StudentService studentService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Pair<String, String> firstQueryParam = UrlUtils.getFirstQueryParam(req.getQueryString());

            switch (firstQueryParam.getKey()) {
                case "id":
                    resp.getWriter().println(
                            SerializeUtils.toJson(studentService.getStudentById(Long.parseLong(firstQueryParam.getValue()))));
                    break;
                default:
                    throw new URISyntaxException(req.getQueryString(), "Unknown query parameter", 0);
            }

        } catch (Exception e) {
            resp.setStatus(500);
            resp.getWriter().println("Internal error");
        }
    }
}
