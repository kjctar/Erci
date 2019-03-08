package Dao.DaoImp;

import Bean.Img;
import Bean.Tag;
import Dao.TagDao;
import org.apache.commons.dbutils.QueryRunner;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import util.JDBCUtils;

import java.sql.SQLException;
import java.util.List;

public class TagDaoImpl implements TagDao {
    @Override
    public List<Tag> getTag(Img img) {
        return null;
    }

    @Override
    public List<Tag> getAllTag() throws SQLException {

        String sql="select * from tag";
        QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
        return qr.query(sql, new BeanListHandler<Tag>(Tag.class));

    }

    @Override
    public void addTag(Tag tag) throws SQLException {
        String sql="INSERT INTO tag VALUES(?,?,?)";
        QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
        Object[] params={tag.getTid(),tag.getTname(),tag.getChangedate()};
        qr.update(sql, params);
    }

    @Override
    public void changeTag(Tag tag) {

    }

    @Override
    public void deleteTag(Tag tag) {

    }

    @Override
    public Tag getByTname(String tname) throws SQLException {
        String sql="select * from tag where tname=?";
        QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
        return qr.query(sql, new BeanHandler<Tag>(Tag.class),tname);
    }
}
