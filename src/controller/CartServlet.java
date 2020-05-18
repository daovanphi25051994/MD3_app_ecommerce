package controller;

import model.customer.Item;
import model.customer.Order;
import model.database.DBItem;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CartServlet", urlPatterns = "/cart")
public class CartServlet extends HttpServlet {
    DBItem dbItem = new DBItem();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        int defaultQuantity = 1;
        int defaultId = 1;

        if (session.getAttribute("userName") == null) {
            request.getRequestDispatcher("jsp/login.jsp").forward(request, response);
        } else {
            if (session.getAttribute("order") == null) {
                String id = request.getParameter("itemID");
                ResultSet item = dbItem.getItemByID(id);
                try {
                    ArrayList<Item> listItem = new ArrayList<>();
                    item.next();
                    listItem.add(new Item(item.getString(1), item.getString(2), item.getString(3), item.getFloat(4), defaultQuantity, item.getString(6), item.getString(7)));
                    String name = (String) session.getAttribute("userName");
                    Order order = new Order(defaultId, name, listItem);
                    session.setAttribute("order", order);
                    request.getRequestDispatcher("jsp/order.jsp").forward(request,response);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }else {
                Order order = (Order) session.getAttribute("order");
                ArrayList<Item> listItem = order.getListItem();
                String id = request.getParameter("itemID");
                boolean isExist = false;
                for (Item item : listItem){
                    if (item.getItemID().equals(id)){
                        item.setItemAmount(item.getItemAmount() + defaultQuantity);
                        request.getRequestDispatcher("jsp/order.jsp").forward(request,response);
                        isExist =true;
                    }
                }

                if (!isExist){
                    ResultSet item = dbItem.getItemByID(id);
                    try {
                        item.next();
                        listItem.add(new Item(item.getString(1), item.getString(2), item.getString(3), item.getFloat(4), defaultQuantity, item.getString(6), item.getString(7)));
                        session.setAttribute("order", order);
                        request.getRequestDispatcher("jsp/order.jsp").forward(request,response);

                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
            }
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
