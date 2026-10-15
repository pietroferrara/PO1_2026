package it.unive.dais.po1.ticketingplatform;

import it.unive.dais.po1.ticketingplatform.event.Event;
import it.unive.dais.po1.ticketingplatform.ticket.Ticket;

public class TicketingApp {
    public static void main(String[] args) {
        Event event = new Event("Cars", "Cinema", 100);
        int price = 10;
        event.refund();
        System.out.println("Ticket sold:"+ Ticket.createTicket(event, 10));
        Ticket.createTicket(event, 10);
        Ticket.createTicket(event, 10);
        Ticket.createTicket(event, 10);

        event.refund();
        System.out.println(event.description());

    }
}
