package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int tics=0;
            while (tics !=-1){
            System.out.print("Please enter number of tickets: ");
           tics=scanner.nextInt();
           if(tics == -1){
               System.out.println("Thank you for coming ,see you next time ～");
           }else {
            System.out.print("How many round-trip tickets: ");
            int roundtrip=scanner.nextInt();
            Tickets tickets = new Tickets(tics,roundtrip);
            tickets.show();
           }
        }
    }
}
