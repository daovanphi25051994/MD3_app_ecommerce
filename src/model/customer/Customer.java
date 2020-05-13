package model.customer;

public class Customer {
    private int customerID;
    private String customerName;
    private String customerPassword;
    private String customerPhoneNumber;
    private String customerEmail;
    private String customerAddress;


    public Customer(int id, String name, String password, String phoneNumber, String email, String address) {
        this.customerID = id;
        this.customerName = name;
        this.customerPassword = password;
        this.customerPhoneNumber = phoneNumber;
        this.customerEmail = email;
        this.customerAddress = address;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }


    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }


    public String toString() {
        return "id : " + this.customerID
                + " ; name : " + this.customerName
                + " ; password : " + this.customerPassword
                + " ; phone : " + this.customerPhoneNumber
                + " ; email : " + this.customerEmail
                + " ; address : " + this.customerAddress;
    }
}
