package com.ezeu.seller;
import java.util.Scanner;
//import static com.company.VendingMachine.*;
import static java.lang.System.exit;
public class Owner {
    private VendingMachine vendingMachine;
    public Owner() {
        this.vendingMachine = VendingMachine.getInstance();
    }
    public void displayOwnerOptions() {
        System.out.println("1.add item \t 2.remove item \t 3 display item \t 4 exit \t 5 goto home:");
    }
    public void ownerfeaures()
    {
        int choice;
        do {
            System.out.println("enter ur choice");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1 : {
                    vendingMachine.addItem();
                    break;
                }
                case 2 : {
                    vendingMachine.deleteItem();
                    break;
                }
                case 3 : {
                    vendingMachine.toString();
                    break;
                }
                case 4 : {
                    exit(0);
                    break;
                }
                case 5 :{
                    Main Main = new Main();
                    break;
                }
                default : {
                    System.out.println("enter proper choice:");
                    break;
                }
            }
        } while (choice<5);
    }
}

