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
import java.sql.SQLException;

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

    public String LoginPage(HttpServletRequest req, HttpServletResponse resp){

        System.out.println("等待跳转登录页面");
        return "/jsp/login.jsp";

    }
}
