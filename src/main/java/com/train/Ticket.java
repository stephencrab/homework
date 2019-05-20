package com.train;

public class Ticket {
    int ticket;
    int round;
    double discount = 0.9;
    int ticketFee = 1000;
    int ticketFee_round = 2000;

    public Ticket(int ticket, int round) {
        this.ticket = ticket;
        this.round =round;
    }

    public void print() {
        System.out.println("Total tickets: "+ticket+"\nRound-trip: "+round+"\nTotal: "+totalFee());
    }

    public int totalFee() {
        return (int)((ticket-round)*ticketFee+(round*discount*ticketFee_round));
    }
}
