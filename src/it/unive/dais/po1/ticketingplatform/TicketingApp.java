package it.unive.dais.po1.ticketingplatform;

import it.unive.dais.po1.ticketingplatform.event.Event;

public class TicketingApp {
    public static void main(String[] args) {
        Event event = new Event("Cars", "Cinema", 100);
        event.refund();
        System.out.println("Ticket sold:"+event.sellSeat());
        event.sellSeat();
        event.sellSeat();
        event.sellSeat();

        event.refund();
        System.out.println(event.description());

    }
}
