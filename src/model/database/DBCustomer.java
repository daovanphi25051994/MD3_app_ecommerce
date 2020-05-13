package model.database;

import model.customer.Customer;

import java.sql.ResultSet;

public class DBCustomer {
    DAL dal;

    public DBCustomer() {
        dal = new DAL();
    }

    public ResultSet getListCustomer() {
        return dal.getData("select * from customer");
    }

    public ResultSet getNameAndPasswordListCustomer() {
        return dal.getData("select customerName, customerPassword from customer;");
    }

    public boolean saveDataCustomer(Customer customer) {
        return dal.updateData("insert into customer(customerName,customerPassword,customerPhoneNumber,customerEmail, customerAddress )" +
                "values('" + customer.getCustomerName() + "', '" + customer.getCustomerPassword() + "', '" + customer.getCustomerPhoneNumber() + "',' " + customer.getCustomerEmail() + "' , '" + customer.getCustomerAddress() + "');");
    }
}
