package servlet;

import crud.DbHelper;
import crud.User;
import crud.UserDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Цымбалюк Сергей on 24.04.2016.
 */

@WebServlet("/main")
public class MainServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<User> allUser= new UserDAO().getAllUsersFromDb();
        response.setContentType("netscape = =text/html");
        request.setAttribute("users",allUser);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/mainframe.jsp");
        dispatcher.forward(request, response);
        DbHelper.close();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request,response);
    }
}
