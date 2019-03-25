package Server;

import Bean.User;

import java.sql.SQLException;

public interface UserService {

    User findUserByUsreName(String um);

    void userRegist(User user01);

    User userActive(String code) throws SQLException;

    void updateUser(User user);

    User userLogin(User user) throws SQLException;
}
