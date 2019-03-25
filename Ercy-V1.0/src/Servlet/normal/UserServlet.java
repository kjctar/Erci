package Servlet.normal;

import Bean.User;
import Server.ServerImp.UserServiceImpl;
import Server.UserService;
import Servlet.navigate.NavigateServlet;
import util.MyBeanUtils;
import util.UUIDUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.UUID;

@WebServlet(name="UserServlet" ,urlPatterns = "/UserServlet")
public class UserServlet extends NavigateServlet {

     public String Login(HttpServletRequest req, HttpServletResponse resp){

         System.out.println(req.getParameter("name"));
         User user = new User();
          MyBeanUtils.populate(user,req.getParameterMap());
          UserService userser = new UserServiceImpl();

         try {
                 user=userser.userLogin(user);
                 req.getSession().setAttribute("user",user);

          } catch (Exception e) {

             e.printStackTrace();
         }
         return "/jsp/index.jsp";

     }

    public String Register(HttpServletRequest req, HttpServletResponse resp){

         //System.out.println(req.getParameter("name"));
        User user = new User();
        user.setUid(UUIDUtils.getId());
        MyBeanUtils.populate(user,req.getParameterMap());
        UserService userser = new UserServiceImpl();

        try {
            userser.userRegist(user);

        } catch (Exception e) {

            e.printStackTrace();
        }
        return "/jsp/index.jsp";

    }

    public String LoginPage(HttpServletRequest req, HttpServletResponse resp){

        System.out.println("等待跳转登录页面");
        return "/jsp/login.jsp";

    }

    public String RegisterPage(HttpServletRequest req, HttpServletResponse resp){

        System.out.println("等待跳转登录页面");
        return "/jsp/RegisterPage.jsp";

    }

    public String Active(HttpServletRequest req, HttpServletResponse resp){

         String code=req.getParameter("ID");
        UserService userser = new UserServiceImpl();
        try {
            userser.userActive(code);
            resp.setContentType("text/html;charset=UTF-8");
            PrintWriter ps=resp.getWriter();
            ps.println("<script>alert('激活成功！')</script>");
            System.out.println("激活");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }
}
