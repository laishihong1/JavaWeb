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

//����session����������
@WebServlet("/Session01")
public class session extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          //�����û�����

        System.out.println("session��ȡ����");
        //����session����
        HttpSession session = request.getSession();

        //��������
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy��MM��dd��"+"HH-mm-ss");
        session.setAttribute("visit",simpleDateFormat.format(new Date()));

    }
}
