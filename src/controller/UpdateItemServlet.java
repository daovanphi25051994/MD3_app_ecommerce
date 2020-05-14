package controller;

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

@WebServlet(name = "UpdateServlet" , urlPatterns = "/update")
public class UpdateItemServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String updateItem = request.getParameter("updateItem");
        String deleteItem = request.getParameter("deleteItem");
        String itemID = request.getParameter("itemID");
        String itemName = request.getParameter("itemName");
        String itemPrice = request.getParameter("itemPrice");
        String itemAmount = request.getParameter("itemAmount");
        String itemCategory = request.getParameter("itemCategory");
        String itemDescribe = request.getParameter("itemDescribe");
        DBItem dbItem = new DBItem();
        ResultSet listItemId = dbItem.getListItemID();
        if (updateItem.equals("update")){

        }
        if (deleteItem.equals("delete")){
            while (true){
                try {
                    if (!listItemId.next()) break;
                    if (listItemId.getString(1).equals(itemID)){
                        dbItem.deleteItemByID(itemID);
                        break;
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }

            }
            request.getRequestDispatcher("jsp/admin.jsp").forward(request, response);

        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
