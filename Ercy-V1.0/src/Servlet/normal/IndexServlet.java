package Servlet.normal;

import Servlet.navigate.NavigateServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "IndexServlet"  ,urlPatterns = "/IndexServlet")
public class IndexServlet extends NavigateServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);


    }

    @Override
    public String initPage(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("返回主页");
        return "/jsp/index.jsp";
    }
}
