package cookice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/Servlet03")
public class Servlet03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //如果是第一次访问，提示首次访问，保存当前时间到cookie
        //不是第一次访问，提示：欢迎回来，上次访问时间，保存当前时间到cookie

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        //定义一个变量，表示用户是否首次访问
        boolean b=false;
        //获取客户端传送过来的cookie集合
        Cookie[] cookies = request.getCookies();
        //遍历这个集合，是否有lastTime这个cookie
        //判断cookie集合是否为空
        if(cookies!=null&&cookies.length!=0){
            for (Cookie cookie : cookies) {
                //判断cookie集合中是否有lastTime
                if(cookie.getName().equals("lastTime")){
                    //说明cookies有lastTime这个cookie
                    b=true;
                    //获取lastTime值
                    String value = cookie.getValue();

                    //时间设置为中文格式 yyyy-mm-dd hh:mm:ss
                    SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日"+"HH:mm:ss");

                    //保存这次当前时间值 到 cookie
                    cookie.setValue(URLEncoder.encode(sdf.format(new Date())));
                    cookie.setMaxAge(60*60*24*30);
                    //将这个cookie 保存到客户端
                    //将这个cookie 保存到客户端
                    response.addCookie(cookie);
                    //显示信息到客户端
                    response.getWriter().write("欢迎回来，你上次访问时间为："+ URLDecoder.decode(value));
                }
            }
        }

        //如果cookie为空
        if(!b)
        {
            //首次访问 创建这个cookie
            //时间设置为中文格式 yyyy-mm-dd hh:mm:ss
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日"+"HH:mm:ss");

            //创建新的时间存入到cookie
            Cookie lastTime = new Cookie("lastTime", URLEncoder.encode(sdf.format(new Date())));
            lastTime.setMaxAge(60*60*24*7);
            response.addCookie(lastTime);
            //显示信息
            response.getWriter().write("欢迎首次访问");
        }
    }
    }

