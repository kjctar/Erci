package Server.ServerImp;

import Bean.Img;
import Dao.DaoImp.ImgDaoImpl;
import Dao.ImgDao;
import Server.ImgService;
import Server.TagService;
import com.sun.javafx.iio.ImageStorage;

import java.sql.SQLException;
import java.util.List;

public class ImgServiceImp implements ImgService {


    ImgDao idao=new ImgDaoImpl();
    @Override
    public List<Img> getBlockImg(int o, String key)  throws SQLException {




        return  idao.getAllImg();
    }

    @Override
    public void upImg(Img img) throws SQLException {
        System.out.println("执行upimgDao");

        TagService tagService= new TagServiceImpl();
        img.setTag(tagService.insert(img.getTag()));
        ImgDao imgDao = new ImgDaoImpl();
        imgDao.addImg((Img) img);
    }




}
