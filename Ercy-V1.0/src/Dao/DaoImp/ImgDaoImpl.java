package Dao.DaoImp;

import Bean.Img;
import Bean.Tag;
import Bean.User;
import Dao.ImgDao;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import util.JDBCUtils;

import java.sql.SQLException;
import java.util.List;

public class ImgDaoImpl implements ImgDao {
    @Override
    public List<Img> getImg(User user) {
        return null;
    }

    @Override
    public List<Img> getImg(Tag tag) {
        return null;
    }

    @Override
    public List<Img> getAllImg()  throws SQLException {
        String sql="select * from imglibrary";
        QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
        return qr.query(sql, new BeanListHandler<Img>(Img.class));
    }

    @Override
    public void addImg(Img img) throws SQLException {
        String sql="INSERT INTO imglibrary VALUES(?,?,?,?)";
        QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
        Object[] params={img.getMid(),img.getSize(),img.getUrl(),img.getUpdate()};
        qr.update(sql, params);
    }

    @Override
    public void changeImg(Img img) {

    }

    @Override
    public void deleteImg(Img img) {

    }
}
