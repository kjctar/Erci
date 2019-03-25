package util;
import com.sun.mail.util.MailSSLSocketFactory;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.security.GeneralSecurityException;
import java.util.Properties;

public class Mail {

         private static String HostName="smtp.qq.com";
         private static String HostMail="2412864341@qq.com";
         private static  String HostPassword="yeygpvlwmfoqeaae";


        public static void SendMail(String UserMail,String Title,String Msg) throws MessagingException, GeneralSecurityException{
             Properties props = new Properties();

             // 开启debug调试
             props.setProperty("mail.debug", "true");
             // 发送服务器需要身份验证
             props.setProperty("mail.smtp.auth", "true");
             // 设置邮件服务器主机名
             props.setProperty("mail.host", HostName);
             // props.setProperty("mail.port", "465");
             // 发送邮件协议名称
             props.setProperty("mail.transport.protocol", "smtp");

             MailSSLSocketFactory sf = new MailSSLSocketFactory();
             sf.setTrustAllHosts(true);
             props.put("mail.smtp.ssl.enable", "true");
             props.put("mail.smtp.ssl.socketFactory", sf);

             Session session = Session.getInstance(props);
             Message msg = new MimeMessage(session);

             msg.setSubject(Title);
             msg.setText(Msg);

             msg.setFrom(new InternetAddress(HostMail));
             Transport transport = session.getTransport();
             transport.connect(HostName, HostMail, HostPassword);
             transport.sendMessage(msg, new Address[] { new InternetAddress(UserMail) });

             transport.close();

         }

        public static void main(String[] args)  {

            try {
                SendMail("487502438@qq.com","你好","你在干嘛呢");
            } catch (MessagingException e) {
                e.printStackTrace();
            } catch (GeneralSecurityException e) {
                e.printStackTrace();
            }
        }

}
