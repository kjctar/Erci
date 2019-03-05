package Server;

import Bean.User;

public interface UserService {

    User findUserByUsreName(String um);

    void userRegist(User user01);

    User userActive(String code);

    void updateUser(User user);

    User userLogin(User user);
}
