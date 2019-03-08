package Servlet.normal;

import Bean.Img;
import Bean.Tag;
import Bean.User;
import Server.ImgService;
import Server.ServerImp.ImgServiceImp;
import Server.ServerImp.TagServiceImpl;
import Server.TagService;
import Servlet.navigate.NavigateServlet;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;
import util.UUIDUtils;
import util.UploadUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

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
              TagService tagser =new TagServiceImpl();

              List<Tag> tags;
              List<Img> images;

               images=imgser.getBlockImg(1,"gg");
               tags=tagser.getAll();
               System.out.println("size:"+images.size());
               for (int i = 0; i <images.size() ; i++) {
                   System.out.println(images);
               }

               req.setAttribute("images",images);
               req.setAttribute("tags",tags);

           } catch (Exception e) {
               System.out.println("出现异常");
               e.printStackTrace();
           }
           return "jsp/Imglibrary.jsp";
       }

    public String upImg(HttpServletRequest req, HttpServletResponse resp){



        Map<String,String> map=new HashMap<String,String>();
        try {
              Img img= new Img();

            if(req.getSession().getAttribute("user")!=null){


                DiskFileItemFactory fac=new DiskFileItemFactory();
                ServletFileUpload upload=new ServletFileUpload(fac);
                List<FileItem> list=upload.parseRequest(req);


                List<Tag> tag=new ArrayList<>();
                for (FileItem Item : list) {
                    if(Item.isFormField()){
                        map.put(Item.getFieldName(),Item.getString("utf-8"));
                        System.out.println( Item.getFieldName()+"<-name"+Item.getString("utf-8"));
                        String tags[]=Item.getString("utf-8").split(" ");



                        if(tags!=null){
                            for (int i = 0; i < tags.length; i++) {
                                Tag temp=new Tag();
                                temp.setTname(tags[i]);
                                tag.add(temp);
                                System.out.println(tags[i]);

                            }

                        }else{
                            System.out.println("标签不存在！");
                        }

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

                BeanUtils.populate(img,map);
                img.setMid(UUIDUtils.getId());
                img.setSize(50);
                img.setUpdate(new Date());
                img.setTag(tag);
                img.setUser((User)req.getSession().getAttribute("user"));
                System.out.println("开始执行server");
                ImgService imgSer=new ImgServiceImp();
                imgSer.upImg(img);

            }else{
                System.out.println("未登录无法上传");
            }
            resp.sendRedirect("/ImgLibraryServlet?navigate=LoadImgPage");

        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;
    }
    public String upPage(HttpServletRequest req, HttpServletResponse resp){


        return "/jsp/upImage.jsp";
    }
}

