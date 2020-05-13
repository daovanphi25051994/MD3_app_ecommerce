package controller;

import model.customer.Customer;
import model.database.DAL;
import model.database.DBCustomer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletRegister", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //nhan du lieu luu vao database
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String rePassword = request.getParameter("rePassword");
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        DBCustomer dbCustomer = new DBCustomer();
        Customer customer = new Customer(1, userName, password, phoneNumber, email, address);
        boolean isOk = dbCustomer.saveDataCustomer(customer);
        if (isOk) {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //tra ve trang khac neu dung nguoc lại trải lai tràn cu
        boolean isOk = (boolean) request.getAttribute("isOk");
        if (isOk) {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }
    }
}