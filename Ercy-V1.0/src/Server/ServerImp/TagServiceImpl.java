package Server.ServerImp;

import Bean.Tag;
import Dao.DaoImp.TagDaoImpl;
import Dao.TagDao;
import Server.TagService;
import util.UUIDUtils;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class TagServiceImpl implements TagService {
    TagDao Dao=new TagDaoImpl();
    @Override
    public Tag getTid(String tname) throws SQLException {


        return Dao.getByTname(tname);

    }

    @Override
    public List<Tag> getAll() throws SQLException {
        return Dao.getAllTag();
    }

    @Override
    public List<Tag> insert(List<Tag> tag) throws SQLException {
        for (int i = 0; i < tag.size(); i++) {
            Tag reqTg=Dao.getByTname(tag.get(i).getTname());
            if(reqTg==null){

                tag.get(i).setTid(UUIDUtils.getId());
                tag.get(i).setChangedate(new Date());
                Dao.addTag(tag.get(i));
            }else{
                  tag.set(i, reqTg);
            }
        }
        return tag;

    }
}
