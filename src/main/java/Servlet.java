import com.sun.net.httpserver.HttpServer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/patients","/doctors"},loadOnStartup = 1)

public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getServletPath();
        if(path.equals("/patients")){
            resp.setContentType("text/html");
            resp.getWriter().write("Hello, my patient");
        }
        else if(path.equals("/doctors")){
            resp.setContentType("text/html");
            resp.getWriter().write("Hello, Dr.");
        }
        else{
            resp.setContentType("text/html");
            resp.getWriter().write("Hello, world");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

}
