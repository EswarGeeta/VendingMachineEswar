package com.ezeu.buyer;
import com.ezeu.seller.VendingItem;
import com.ezeu.seller.VendingMachine;
import java.util.ArrayList;
import java.util.Scanner;
public class Customer {
    Scanner sc= new Scanner(System.in);
    ArrayList<VendingItem> item_list = new ArrayList<>();
    private VendingMachine vendingMachine = new VendingMachine();
    public void customer_page()
    {
        vendingMachine.getItem(1);
        System.out.println("hello customer...........");
        vendingMachine.toString();
        System.out.println("choose item by giving its index:");
        int itm = sc.nextInt();
        --itm;
        VendingItem vii = new VendingItem();
        vii= item_list.get(itm);
        System.out.println("ur selected item is:" + vii.getItemname() + "\tprice:" + vii.getPrice()+"$");
        System.out.println("how many  "+vii.getItemname()+ "  do u want:");
        int qua = sc.nextInt();
        if (qua> vii.getQuantity()){
            System.out.println("we dont have that plenty of  "+vii.getItemname()+ " please enter the required quantity:");
            qua =sc.nextInt();
        }
        int cost = vii.getPrice() * qua;
        System.out.println("pay the bill  " + cost+ "$");
        int bill = sc.nextInt();
        if (bill < cost) {
            System.out.println("u have low balance");
        } else if (bill > cost) {
            int rembal = bill - cost;
            System.out.println("take  "+  vii.getItemname() + "and  take change: " + rembal);
        } else {
            System.out.println("take it  " + vii.getItemname());
        }
        vii.setQuantity(vii.getQuantity()-qua);
        if (vii.getQuantity()<=0){
            item_list.remove(itm);
        }
    }
}

