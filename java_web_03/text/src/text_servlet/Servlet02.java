package text_servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//可以接收get和post请求数据
//英文数据正常
//中文数据可能出现乱码
//指定接收数据用utf-8编码方案

@WebServlet("/getAttribute")
public class Servlet02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           //指定使用编码方案
            request.setCharacterEncoding("utf-8");

        //获取客户端请求包含参数:request.getParmeter
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        System.out.println(account);
        System.out.println(password);

    }
}
