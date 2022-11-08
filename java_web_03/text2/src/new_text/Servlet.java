package new_text;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//response 对象基本功能
//使用字符流发送数据


@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setCharacterEncoding("utf-8");
        System.out.println("请求....");
//
          response.setContentType("text/html;charset=utf-8");
//          PrintWriter printWriter=response.getWriter();
//          String s="消息已经收到";
//          printWriter.write(s);

         response.getWriter().write("<h1>消息已经收到</h1>");




    }
}
