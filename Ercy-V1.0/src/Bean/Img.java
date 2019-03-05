package Bean;

import java.util.Arrays;
import java.util.Date;

public class Img {


    private String mid;
    //private String tag[];
    private int size;
    private String url;
    private Date update;
    //private User user;


    @Override
    public String toString() {
        return "Img{" +
                "mid='" + mid + '\'' +
                ", size=" + size +
                ", url='" + url + '\'' +
                ", update=" + update +
                '}';
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }
}
