package Dao.DaoImp;

import Bean.User;
import Dao.UserDao;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import util.JDBCUtils;

import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    @Override
    public User Login(User user) throws SQLException {

        String sql="select * from user where name=?  and password= ?";
        QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
        return qr.query(sql, new BeanHandler<User>(User.class),user.getName(),user.getPassword());
    }



    @Override
    public void Register(User user) throws SQLException {
        String sql="INSERT INTO user VALUES(?,?,?,?,?,?,?)";
        QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
        Object[] params={user.getuid(),user.getName(),user.getSex(),user.getBirthday(),user.getEmail(),user.getPassword(),user.getStatus()};
        qr.update(sql, params);
    }

    @Override
    public User Active(String shacode) {
        return null;
    }

    @Override
    public void Seal(User user) {

    }

    @Override
    public void Unseal(User user) {

    }

    @Override
    public void update(User user) {

    }
}
