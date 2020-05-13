package controller;

import model.database.DBCustomer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        DBCustomer dbCustomer = new DBCustomer();
        ResultSet listNameAndPassCustomer = dbCustomer.getNameAndPasswordListCustomer();
        while (true){
            try {
                if (!listNameAndPassCustomer.next()) break;
                if (userName.equals(listNameAndPassCustomer.getString(1)) && password.equals(listNameAndPassCustomer.getString(2))){
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        request.getRequestDispatcher("jsp/login.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
