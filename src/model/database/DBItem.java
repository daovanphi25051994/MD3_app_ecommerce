package model.database;

import model.customer.Customer;
import model.customer.Item;

import java.sql.ResultSet;

public class DBItem {
    DAL dal;

    public DBItem() {
        dal = new DAL();
    }

    public ResultSet getListItem() {
        return dal.getData("select * from item;");
    }
    public ResultSet getListItemID() {
        return dal.getData("select itemId from item;");
    }

    public boolean saveDataItem(Item item) {
        return dal.updateData("insert into item() " +
                "values('" + item.getItemID() + "', '" + item.getItemName() + "', '" + item.getItemImage() + "', " + item.getItemPrice() + " , " + item.getItemAmount() + ", '" + item.getItemCategory() + "', '" + item.getItemDescribe() + "');");
    }

    public boolean deleteItemByID(String id) {
        return dal.updateData("delete from item " +
                "where itemId = '"+ id +"';" );
    }
}
