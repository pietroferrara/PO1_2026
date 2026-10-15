package it.unive.dais.po1.ticketingplatform.ticket;

import it.unive.dais.po1.ticketingplatform.event.*;

public class Ticket {
    private final Event event;
    private final int ticket_number;
    private int price;

    private Ticket(Event e, int ticket_number, int price) {
        this.event = e;
        this.ticket_number = ticket_number;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price >= 0)
            this.price = price;
    }

    public Event getEvent() {
        return event;
    }

    public int getTicket_number() {
        return ticket_number;
    }


    //Sell a seat: return its ticket, or null
    static public Ticket createTicket(Event event, int price) {
        if(event.getAvailableSeats() <= 0)
            return null;
        else {
            event.decreaseSeats();
            return new Ticket(event, event.getVenue().getMax_capacity()-(event.getAvailableSeats()), price);
        }
    }

    public boolean isValid(Event e) {
        return this.event==e;
    }
}
