package Servlet.navigate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

@WebServlet(name = "NavigateServlet" ,urlPatterns = "/NavigateServlet")
public class NavigateServlet extends HttpServlet {



    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            String md=req.getParameter("navigate");
            if(md==null){
                md="initPage";
            }
            Class clazz=this.getClass();
        try {
            System.out.println(md);
            Method method= clazz.getMethod(md,HttpServletRequest.class,HttpServletResponse.class);
            String path;
            path = (String) method.invoke(this,req,resp);
            System.out.println(path);
            if(path!=null){
                req.getRequestDispatcher(path).forward(req,resp);
            }
        } catch (Exception e) {
            System.out.println("导航出现异常");
            e.printStackTrace();
        }




    }
    public String initPage(HttpServletRequest req, HttpServletResponse resp){

         return null;
    }
}
