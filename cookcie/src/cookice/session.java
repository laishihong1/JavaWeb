package cookice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

//创建session并保存数据
@WebServlet("/Session01")
public class session extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          //接收用户请求

        System.out.println("session收取请求");
        //创建session对象
        HttpSession session = request.getSession();

        //保存数据
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日"+"HH-mm-ss");
        session.setAttribute("visit",simpleDateFormat.format(new Date()));

    }
}
