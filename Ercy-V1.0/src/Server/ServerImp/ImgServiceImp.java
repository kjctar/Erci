package Server.ServerImp;

import Bean.Img;
import Dao.DaoImp.ImgDaoImpl;
import Dao.ImgDao;
import Server.ImgService;
import com.sun.javafx.iio.ImageStorage;

import java.sql.SQLException;
import java.util.List;

public class ImgServiceImp implements ImgService {


    @Override
    public List<Img> getBlockImg(int o, String key)  throws SQLException {


           ImgDao idao=new ImgDaoImpl();

        return  idao.getAllImg();
    }

    @Override
    public void upImg(Object img) throws SQLException {
        System.out.println("执行upimgDao");
         ImgDao imgDao = new ImgDaoImpl();
         imgDao.addImg((Img) img);
    }

}
