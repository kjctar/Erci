package Bean;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Tag {

     private  String tid;
     private  String tname;
     private List<Img> img ;
     private  Date changedate;

    @Override
    public String toString() {
        return "Tag{" +
                "tid='" + tid + '\'' +
                ", tname='" + tname + '\'' +
                ", img=" + img +
                ", changedate=" + changedate +
                '}';
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public List<Img> getImg() {

        return img;
    }

    public void setImg(List<Img> img) {
        this.img = img;
    }

    public Date getChangedate() {
        return changedate;
    }

    public void setChangedate(Date changedate) {
        this.changedate = changedate;
    }
}
