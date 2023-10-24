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

@WebServlet(urlPatterns = {"/country", "/timeInYourCountry"})
public class CountryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("country.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String country = req.getParameter("country");
        timeInCountryUnd timeInCountryUnd = new timeInCountryUnd(country);
        ZonedDateTime time = timeInCountryUnd.time(country);
        resp.getWriter().println("Time in this country is " + time);
    }
}
