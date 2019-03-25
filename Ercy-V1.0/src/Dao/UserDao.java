package Dao;

import Bean.User;

import java.sql.SQLException;

public interface UserDao {

     User Login(User user) throws SQLException;
     void Register(User user) throws SQLException;
     User Active(String shacode) throws SQLException;
     void Seal(User user);
     void Unseal(User user);
     void update(User user);

}
