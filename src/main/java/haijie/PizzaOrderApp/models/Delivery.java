package haijie.PizzaOrderApp.models;

import java.io.Serializable;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Delivery implements Serializable {
    
    @NotNull(message = "Name must not be empty")
    @Size(min = 3, message = "Name must be at least 3 characters.")
    private String name;

    @NotNull(message = "Address must not be empty")
    private String address;

    @Size(min = 8,max = 8, message = "Phone number must be 8 digit.")
    @NotNull(message = "Phone number cannot be empty")
    private String phone;

    private boolean rush;
    
    private String comments;

    private String id;
    private long orderCost;

    public Delivery(){
        this.id= UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public long getOrderCost() {
        return orderCost;
    }
    public void setOrderCost(long orderCost) {
        this.orderCost = orderCost;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public boolean isRush() {
        return rush;
    }
    public void setRush(boolean rush) {
        this.rush = rush;
    }
    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }
    
}
