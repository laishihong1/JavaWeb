package cookice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/session02")
public class session02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          //接收用户请求
        System.out.println("session02接收请求");
        //获取session对象
        HttpSession session = request.getSession();

        //读取session对象
        if(session.getAttribute("visit")!=null){
            String visit = (String) session.getAttribute("visit");
            //显示数据
            System.out.println(visit);
        }

    }
}
