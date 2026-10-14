package it.unive.dais.po1.ticketingplatform.ticket;

import it.unive.dais.po1.ticketingplatform.event.*;

public class Ticket {
    private final Event event;
    private final int ticket_number;

    public Ticket(Event e, int ticket_number) {
        this.event = e;
        this.ticket_number = ticket_number;
    }
}
