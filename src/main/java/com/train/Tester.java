package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ticket = 0;
        while (ticket != -1) {
        System.out.print("Please enter number of tickets: ");
        ticket = scanner.nextInt();
        if (ticket == -1) {
            System.out.println("exit");
        } else {
            System.out.print("How many round-trip tickets: ");
            int round = scanner.nextInt();
            Ticket t = new Ticket(ticket, round);
            t.print();
        }
        }
    }
}
