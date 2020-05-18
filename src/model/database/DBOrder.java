package model.database;

import model.customer.Item;
import model.customer.Order;

import java.util.ArrayList;

public class DBOrder {
    DAL dal;

    public DBOrder() {
        dal = new DAL();
    }

    public boolean saveOrder(Order order){
        ArrayList<Item> listItem = order.getListItem();
        if (listItem.size() >= 1){
            for (Item item : listItem){
                dal.updateData("insert into orders(customerName, itemId, amount, price) " +
                        "values('"+ order.getCustomerName() +"','"+ item.getItemID() +"', "+ item.getItemAmount() +", "+ item.getItemAmount() * item.getItemPrice() +");");
            }
            return true;
        }else {
            return false;
        }
    }
}
