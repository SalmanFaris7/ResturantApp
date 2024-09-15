/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author Saleem Malik
 */
public class Order {
    private int orderID;
    private String menuItems;
    private int quantity;

    public Order(int orderID, String menuItems, int quantity) {
        this.orderID = orderID;
        this.menuItems = menuItems;
        this.quantity = quantity;
    }

    public int getOrderID() {
        return orderID;
    }

    public String getMenuItems() {
        return menuItems;
    }

    public int getQuantity() {
        return quantity;
    }
    
}
