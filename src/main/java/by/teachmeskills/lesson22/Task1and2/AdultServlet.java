/*Задача 1:
        Создать приложение, которое при переходе на следующие урлы будет выдавать
        результат:
        /minsk - время в Минске
        /washington - время в Вашингтоне
        /beijing - время в Пекине*/
package by.teachmeskills.lesson22.Task1and2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.ZonedDateTime;

@WebServlet(urlPatterns = {"/adult", "/age"})
public class adultServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("age.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int age = Integer.parseInt(req.getParameter("age"));
        if (age >=18)
        {
            resp.getWriter().println("adult");
        }
        else
        {
            resp.getWriter().println("not adult");
        }
    }
}
