package Server.ServerImp;

import Bean.User;
import Dao.DaoImp.UserDaoImpl;
import Dao.UserDao;
import Server.UserService;
import util.Mail;
import util.UUIDUtils;

import javax.mail.MessagingException;
import java.security.GeneralSecurityException;
import java.sql.SQLException;
import java.util.Date;

public class UserServiceImpl implements UserService {

    UserDao Dao=new UserDaoImpl();

    @Override
    public User findUserByUsreName(String um) {
        return null;
    }

    @Override
    public void userRegist(User user) {

        try {

            user.setStatus(0);
            user.setActivecode(UUIDUtils.getCode());
            user.setDate(new Date());
            Dao.Register(user);
            String Msg="请点击连接激活账户  http://localhost:8888/UserServlet?navigate=Active&ID="+user.getActivecode();
            try {

                Mail.SendMail(user.getEmail(),"图站激活邮件",Msg);
            } catch (MessagingException e) {
                e.printStackTrace();
            } catch (GeneralSecurityException e) {
                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public User userActive(String code) throws SQLException {

        Dao.Active(code);

        return null;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public User userLogin(User user) throws SQLException {


        user=Dao.Login(user);

        if(user==null){
             throw new RuntimeException("密码错误！");
        }else if(user.getStatus()==0){
             throw  new RuntimeException("用户未激活！");
        }else {
            return user;
        }


    }
}
