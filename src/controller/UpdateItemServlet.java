package controller;

import model.customer.Item;
import model.database.DBItem;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "UpdateServlet", urlPatterns = "/update")
public class UpdateItemServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println(action);
        String itemID = request.getParameter("itemID");
        String itemName = request.getParameter("itemName");
        String itemImage = request.getParameter("itemImage");
        float itemPrice = Float.valueOf(request.getParameter("itemPrice")) ;
        int itemAmount = Integer.valueOf(request.getParameter("itemAmount")) ;
        String itemCategory = request.getParameter("itemCategory");
        String itemDescribe = request.getParameter("itemDescribe");
        DBItem dbItem = new DBItem();
        ResultSet listItemId = dbItem.getListItemID();
        switch (action){
            case "delete" :
                try {
                   while (listItemId.next()){
                       if (listItemId.getString(1).equals(itemID)){
                           dbItem.deleteItemByID(itemID);
                           request.getRequestDispatcher("jsp/admin.jsp").forward(request, response);
                       }
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
            case "update" :  {
                Item item = new Item(itemID, itemName,itemImage, itemPrice, itemAmount, itemCategory, itemDescribe);
                dbItem.updateItemByID(itemID, item);
                request.getRequestDispatcher("jsp/admin.jsp").forward(request, response);
                break;
            }
        }





    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
