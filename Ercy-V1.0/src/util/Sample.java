package util;

import com.baidu.aip.imageclassify.AipImageClassify;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;



public class Sample {
    //设置APPID/AK/SK
    public static final String APP_ID = "15854623";
    public static final String API_KEY = "gwTxIoUb0HfF7uQQIXKuSzYw";
    public static final String SECRET_KEY = "2qaWNqmRWPqC0QdeOom52KSRdmkzPqKy";


    public static ArrayList<String> Analyse(String path) {

        // 初始化一个AipImageClassifyClient
        AipImageClassify client = new AipImageClassify(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);
        System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("baike_num", "5");

        // 参数为本地路径
        String image = path;
        JSONObject res = client.advancedGeneral(image, options);
        //System.out.println(res.toString(1));

         JSONArray json= res.getJSONArray("result");
         ArrayList<String> data= new ArrayList<>();
        for (Object o : json) {
            JSONObject temp=(JSONObject)o;
           // temp.getString("keyword");
             data.add(temp.getString("keyword"));
             System.out.println(temp.getString("keyword"));
        }
        return data;
    }

    public static void main(String[] args) {

    }

}