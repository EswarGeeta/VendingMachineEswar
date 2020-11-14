package com.ezeu.seller;
import java.util.ArrayList;
public class VendingItem {
    private String itemname;
    private int price;
    private int quantity;
    public VendingItem(String itemname, int price, int quantity){
        super();
        this.itemname=itemname;
        this.price=price;
        this.quantity=quantity;
    }
    public VendingItem() {
        ArrayList<VendingItem> item_list = new ArrayList<>();
    }
    public String getItemname() {
        return itemname;
    }
    public void setItemname(String itemname) {
        this.itemname = itemname;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "item name="+itemname+"  price ="+price+ "$  quantity:"+quantity+" ";
    }
}






