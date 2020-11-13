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
}






