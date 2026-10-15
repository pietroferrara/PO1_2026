package it.unive.dais.po1.ticketingplatform.event;


public class Event {
    private int seats;
    private final Venue venue;
    private final String title;

    public Event(String title, Venue venue) {
        this.seats = venue.getMax_capacity();
        this.title = title;
        this.venue = venue;
    }

    public Event(String title, String venue_name, int max_capacity) {
        this(title, new Venue(venue_name, max_capacity));
    }

    public String description() {
        return this.title + " at " + this.venue.getName() +
                " with " + this.seats +
                " available seats over a capacity of " +
                venue.getMax_capacity();
    }


    //Give back a sold seat
    public void refund() {
        if(this.seats < venue.getMax_capacity())
            this.seats = this.seats + 1;
    }
    //Number of free seats
    public int getAvailableSeats() {
        return this.seats;
    }

    public int getOccupiedSeats() {
        return this.venue.getMax_capacity() - this.getAvailableSeats();
    }

    public boolean isSameVenueOf(Event e) {
        return this.venue==e.venue;
    }

    public Venue getVenue() {
        return venue;
    }

    public void decreaseSeats() {
        if(this.seats>=0)
            this.seats = this.seats - 1;
    }
}

