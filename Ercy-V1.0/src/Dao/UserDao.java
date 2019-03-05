package Dao;

import Bean.User;

public interface UserDao {

     User Login(User user);
     void Register(User user);
     User Active(String shacode);
     void Seal(User user);
     void Unseal(User user);
     void update(User user);

}
