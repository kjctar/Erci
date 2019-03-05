package Dao;

import Bean.Img;
import Bean.Tag;
import Bean.User;

import java.sql.SQLException;
import java.util.List;

public interface ImgDao {

    List<Img> getImg(User user);
    List<Img> getImg(Tag tag);
    List<Img> getAllImg() throws SQLException;

    void addImg(Img img) throws SQLException;
    void changeImg(Img img);
    void deleteImg(Img img);



}
