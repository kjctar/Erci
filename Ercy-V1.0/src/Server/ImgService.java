package Server;

import Bean.Img;

import java.sql.SQLException;
import java.util.List;

public interface ImgService {


    List<Img> getBlockImg(int o, String key) throws SQLException;


    void upImg(Img images) throws SQLException;
}
