package Bean;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Img {


    private String mid;
    private List<Tag> tag;
    private int size;
    private String url;
    private Date update;
    private User user;

    @Override
    public String toString() {
        return "Img{" +
                "mid='" + mid + '\'' +
                ", size=" + size +
                ", url='" + url + '\'' +
                ", update=" + update +
                ", user=" + user +
                '}';
    }


    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public List<Tag> getTag() {
        return tag;
    }

    public void setTag(List<Tag> tag) {
        this.tag = tag;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
