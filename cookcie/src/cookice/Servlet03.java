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

        //����ǵ�һ�η��ʣ���ʾ�״η��ʣ����浱ǰʱ�䵽cookie
        //���ǵ�һ�η��ʣ���ʾ����ӭ�������ϴη���ʱ�䣬���浱ǰʱ�䵽cookie

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        //����һ����������ʾ�û��Ƿ��״η���
        boolean b=false;
        //��ȡ�ͻ��˴��͹�����cookie����
        Cookie[] cookies = request.getCookies();
        //����������ϣ��Ƿ���lastTime���cookie
        //�ж�cookie�����Ƿ�Ϊ��
        if(cookies!=null&&cookies.length!=0){
            for (Cookie cookie : cookies) {
                //�ж�cookie�������Ƿ���lastTime
                if(cookie.getName().equals("lastTime")){
                    //˵��cookies��lastTime���cookie
                    b=true;
                    //��ȡlastTimeֵ
                    String value = cookie.getValue();

                    //ʱ������Ϊ���ĸ�ʽ yyyy-mm-dd hh:mm:ss
                    SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd��"+"HH:mm:ss");

                    //������ε�ǰʱ��ֵ �� cookie
                    cookie.setValue(URLEncoder.encode(sdf.format(new Date())));
                    cookie.setMaxAge(60*60*24*30);
                    //�����cookie ���浽�ͻ���
                    //�����cookie ���浽�ͻ���
                    response.addCookie(cookie);
                    //��ʾ��Ϣ���ͻ���
                    response.getWriter().write("��ӭ���������ϴη���ʱ��Ϊ��"+ URLDecoder.decode(value));
                }
            }
        }

        //���cookieΪ��
        if(!b)
        {
            //�״η��� �������cookie
            //ʱ������Ϊ���ĸ�ʽ yyyy-mm-dd hh:mm:ss
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd��"+"HH:mm:ss");

            //�����µ�ʱ����뵽cookie
            Cookie lastTime = new Cookie("lastTime", URLEncoder.encode(sdf.format(new Date())));
            lastTime.setMaxAge(60*60*24*7);
            response.addCookie(lastTime);
            //��ʾ��Ϣ
            response.getWriter().write("��ӭ�״η���");
        }
    }
    }

