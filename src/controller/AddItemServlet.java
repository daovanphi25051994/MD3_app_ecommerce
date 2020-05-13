package controller;

import model.customer.Item;
import model.database.DBItem;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;

@WebServlet(name = "AddItemServlet", urlPatterns = "/addItem")
public class AddItemServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String itemID = request.getParameter("itemID");
        String itemName = request.getParameter("itemName");
        String itemImage = request.getParameter("itemImage");
        float itemPrice = Float.valueOf(request.getParameter("itemPrice"));
        int itemAmount = Integer.valueOf(request.getParameter("itemAmount"));
        String itemCategory = request.getParameter("itemCategory");
        String itemDescribe = request.getParameter("itemDescribe");
        Item item = new Item(itemID, itemName, itemImage, itemPrice, itemAmount, itemCategory, itemDescribe);
        DBItem dbItem = new DBItem();
        boolean isSaved = dbItem.saveDataItem(item);
        if (isSaved){
            request.getRequestDispatcher("jsp/admin.jsp").forward(request, response);
        }else {
            request.getRequestDispatcher("jsp/admin.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
