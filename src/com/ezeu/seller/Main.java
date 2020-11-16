package com.ezeu.seller;
import java.util.ArrayList;
import java.util.Scanner;
import com.ezeu.buyer.Customer;
import static java.lang.System.exit;
public class Main {
    ArrayList<VendingItem> item_list = new ArrayList<>();
    public static void main(String[] args) {
        int cc;
        System.out.println("***************welcome to vending machine*******kiran*********");
        do {
            System.out.println("Owner---1\t\t\t\t\tCustomer------2");
            Scanner sc = new Scanner(System.in);
            cc = sc.nextInt();
            if (cc == 1) {
                //  VendingItems vending = new VendingItems();
                Owner owner = new Owner();
                owner.displayOwnerOptions();
                owner.ownerfeaures();

            }
            if (cc == 2) {
                Customer c = new Customer();
                c.customer_page();
            }
        }while (true);
    }
}





