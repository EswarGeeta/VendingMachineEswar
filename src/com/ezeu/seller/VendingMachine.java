package com.ezeu.seller;
import java.util.ArrayList;
import java.util.Scanner;
public class VendingMachine {
    //Implementing  VendingMachine as a singleton object
    private static VendingMachine instance = new VendingMachine();
    ArrayList<VendingItem> item_list = new ArrayList<>();
    private ArrayList<VendingItem> items;
    public VendingMachine() {
        this.items = new ArrayList<>();
        this.items.add(new VendingItem("COKE", 10, 10 ));
    }
    public static VendingMachine getInstance()
    {
        return instance;
    }
    protected void addItem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the item u have to add:");
        String item = sc.nextLine();
        System.out.println("enter price for that:");
        int price = sc.nextInt();
        System.out.println("quantity to that:");
        int quantity = sc.nextInt();
        VendingItem vi = new VendingItem(item, price, quantity);
        items.add(vi);
        System.out.println("item added to the machine");
    }
    protected void deleteItem() {
        System.out.println("enter the index  u have to delete");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        items.remove(num);
        System.out.println("u deleted the item");
    }
    public VendingItem getItem(int index) {
        return null;
    }
    private void deleteItem(int index) {
        items.remove(index);
    }
    public String toString()
    {
        System.out.println("items are");
        String result = null;
        int k = 0;
        for (VendingItem result1 : item_list) {
            System.out.println(k+ "  " + result1);
            k = k + 1;
        }
    	/*System.out.println("available items are");
        String result = null;
        for(int i=0; i<items.size(); i++) {
            result += i + "  " + items.get(i);
        }
        result += "\n";
        return result;*/
        return null;
    }
}





