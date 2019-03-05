package Server.ServerImp;

import Bean.User;
import Dao.DaoImp.UserDaoImpl;
import Dao.UserDao;
import Server.UserService;

import java.sql.SQLException;

public class UserServiceImpl implements UserService {
    @Override
    public User findUserByUsreName(String um) {
        return null;
    }

    @Override
    public void userRegist(User user01) {

    }

    @Override
    public User userActive(String code) {
        return null;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public User userLogin(User user) throws SQLException {

        UserDao Dao=new UserDaoImpl();
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
