package Server;

import Bean.Tag;

import java.sql.SQLException;
import java.util.List;

public interface TagService {

    Tag getTid(String tnme) throws SQLException;
    List<Tag> getAll() throws SQLException;


    List<Tag> insert(List<Tag> tag) throws SQLException;
}
