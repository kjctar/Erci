package Dao;

import Bean.Img;
import Bean.Tag;

import java.util.List;

public interface TagDao {

    List<Tag> getTag(Img img);

    List<Tag> getAllTag();

    void addTag(Tag tag);

    void changeTag(Tag tag);

    void deleteTag(Tag tag);

}
