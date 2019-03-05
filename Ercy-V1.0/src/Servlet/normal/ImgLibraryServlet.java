package Servlet.normal;

import Bean.Img;
import Server.ImgService;
import Server.ServerImp.ImgServiceImp;
import Servlet.navigate.NavigateServlet;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;
import util.UUIDUtils;
import util.UploadUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.*;

@WebServlet(name = "ImgLibraryServlet" ,urlPatterns = "/ImgLibraryServlet")
public class ImgLibraryServlet extends NavigateServlet {

       public String LoadImgPage(HttpServletRequest req, HttpServletResponse resp){
//           int Location= 0;
//           String key= null;
//           try {
//               Location = Integer.valueOf(req.getParameter("Location"));
//               key = req.getParameter("key");
//           } catch (NumberFormatException e) {
//
//           }
//
           try {
             ImgService imgser = new ImgServiceImp();
              List<Img> images=new ArrayList<>();
               images=imgser.getBlockImg(1,"gg");
               System.out.println("size:"+images.size());
               for (int i = 0; i <images.size() ; i++) {
                   System.out.println(images);
               } req.setAttribute("images",images);
           } catch (Exception e) {
               System.out.println("出现异常");
               e.printStackTrace();
           }
           return "jsp/Imglibrary.jsp";
       }

    public String upImg(HttpServletRequest req, HttpServletResponse resp){



        Map<String,String> map=new HashMap<String,String>();
        try {
            DiskFileItemFactory fac=new DiskFileItemFactory();
            ServletFileUpload upload=new ServletFileUpload(fac);
            List<FileItem> list=upload.parseRequest(req);

            for (FileItem Item : list) {
                   if(Item.isFormField()){
                       map.put(Item.getName(),Item.getString("utf-8"));
                   }else{
                        InputStream is=Item.getInputStream();
                        String newFilename = UploadUtils.getUUIDName(Item.getName());
                       System.out.println(newFilename);
                       String realurl=getServletContext().getRealPath("/images");
                        String dir=UploadUtils.getDir(newFilename);

                       System.out.println("8层地址："+dir);
                       realurl=realurl+dir;
                       System.out.println("真实地址："+realurl);
                       File newDir=  new File(realurl);
                        if(!newDir.exists()){
                              newDir.mkdirs();
                        }
                        File finalFile = new File(newDir,newFilename);
                        if(!finalFile.exists()){
                            finalFile.createNewFile();
                        }

                       OutputStream os=new FileOutputStream(finalFile);

                       IOUtils.copy(is,os);
                       IOUtils.closeQuietly(is);
                       IOUtils.closeQuietly(os);

                       System.out.println("/images/"+dir+"/"+newFilename);
                       map.put("url","/images"+dir+"/"+newFilename);
                   }
            }
            Img img= new Img();
            BeanUtils.populate(img,map);
            img.setMid(UUIDUtils.getId());
            img.setSize(50);
            img.setUpdate(new Date());
            System.out.println("开始执行server");
            ImgService imgSer=new ImgServiceImp();
            imgSer.upImg(img);
            resp.sendRedirect("/ImgLibraryServlet?navigate=LoadImgPage");
        } catch (FileUploadException | IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("上传异常");
            e.printStackTrace();
        }


        return null;
    }
    public String upPage(HttpServletRequest req, HttpServletResponse resp){


        return "/jsp/upImage.jsp";
    }
}

