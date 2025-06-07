package com.synchronization;

public class TicketBookingMachine {

    public static void main(String[] args) {
        Thread user1 = new Thread(() -> {
            System.out.println(Ticketbooking.bookTicket("User1"));
        });

        Thread user2 = new Thread(() -> {
            System.out.println(Ticketbooking.bookTicket("User2"));
        });

        Thread user3 = new Thread(() -> {
            System.out.println(Ticketbooking.bookTicket("User3"));
        });

        user1.start();
        user2.start();
        user3.start();
        
        try {
            user1.join();
            user2.join();
            user3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


