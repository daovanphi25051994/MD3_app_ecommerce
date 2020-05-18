package controller;

import model.customer.Order;
import model.database.DBOrder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "BuyServlet" , urlPatterns = "/buy")
public class BuyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "buy":
                DBOrder dbOrder = new DBOrder();
                HttpSession session = request.getSession();
                Order order = (Order) session.getAttribute("order");
                dbOrder.saveOrder(order);
                request.getRequestDispatcher("jsp/order.jsp").forward(request,response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
