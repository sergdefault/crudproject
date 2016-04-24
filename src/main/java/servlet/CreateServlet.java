package servlet;

import crud.User;
import crud.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Цымбалюк Сергей on 24.04.2016.
 */
@WebServlet("/create")
public class CreateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("username");
        String city = req.getParameter("city");
        int age = Integer.parseInt(req.getParameter("age"));
        User user = new User(name, city, age);
        UserDAO userDAO = new UserDAO();
        userDAO.addUser(user);
        new MainServlet().doPost(req, resp);
    }


}
