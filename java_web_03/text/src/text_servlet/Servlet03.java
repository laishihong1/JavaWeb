package text_servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/setAttribute")
public class Servlet03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                     //取数据,每次请求都会创建专有的request对象
              String s =  (String) request.getAttribute("account");
              String password =(String) request.getAttribute("password");
              System.out.println(s);
              System.out.println(password);


              //请求转发
             //获取请求转发器
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/getAttribute");
        //转发
        //系统会将请求转给指定的servlet
        requestDispatcher.forward(request,response);


    }
}
