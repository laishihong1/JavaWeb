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
          //�����û�����
        System.out.println("session02��������");
        //��ȡsession����
        HttpSession session = request.getSession();

        //��ȡsession����
        if(session.getAttribute("visit")!=null){
            String visit = (String) session.getAttribute("visit");
            //��ʾ����
            System.out.println(visit);
        }

    }
}
