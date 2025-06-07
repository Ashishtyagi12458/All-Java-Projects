package com.synchronization;

public class Ticketbooking {

    private static int availableTickets = 10;
    private static int ticketNumber = 1;

    public static synchronized String bookTicket(String userName) {
        if (availableTickets > 0) {
            String ticketInfo = "Ticket Number: " + ticketNumber + ", Booked by: " + userName;
            ticketNumber++;
            availableTickets--;
            return ticketInfo;
        } else {
            return "No tickets available!";
        }
    }
}
