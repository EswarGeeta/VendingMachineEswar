package com.ezeu.seller;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    static ArrayList<VendingItem> item_list = new ArrayList<>();

    public static void main(String[] args) {
        int cc;
        System.out.println("**********welcome to vending machine******");
        do {
            System.out.println("Owner---1\t\t\t\t\tCustomer------2");
            Scanner sc = new Scanner(System.in);
             cc = sc.nextInt();
            if (cc == 1) {
              //  VendingItems vending = new VendingItems();
                Owner owner = new Owner();
                owner.ownerfeaures();
            }
            if (cc == 2) {
                customer c = new customer();
                c.customer_page();
            }
        }while (true);
    }


    public void ownerfeaures() {
        do {
            System.out.println("enter ur choice");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {


                    vendingMachine.addItem();
                    break;
                }
                case 2 -> {
                    vendingMachine.deleteItem();
                    break;
                }
                case 3 -> {
                    vendingMachine.toString();
                    break;
                }
                case 4 -> {
                    exit(0);
                    break;
                }

                default -> {
                    System.out.println("enter proper choice:");
                    break;
                }

            }
        } while (choice<5);
    }
}




