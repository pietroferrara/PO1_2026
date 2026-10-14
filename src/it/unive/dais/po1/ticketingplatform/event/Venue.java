package it.unive.dais.po1.ticketingplatform.event;

class Venue {
    private final String name;
    private final int max_capacity;

    Venue(String name, int max_capacity) {
        this.name = name;
        if(max_capacity >= 0 )
            this.max_capacity = max_capacity;
        else this.max_capacity = 0;
    }

    public String getName() {
        return name;
    }

    int getMax_capacity() {
        return max_capacity;
    }
}
