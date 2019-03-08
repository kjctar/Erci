package Dao;

import Bean.Img;
import Bean.Tag;

import java.sql.SQLException;
import java.util.List;

public interface TagDao {

    List<Tag> getTag(Img img);

    List<Tag> getAllTag() throws SQLException;

    void addTag(Tag tag) throws SQLException;

    void changeTag(Tag tag);

    void deleteTag(Tag tag);

    Tag getByTname(String tname) throws SQLException;
}
