package it.unive.dais.po1.agenda;

import java.util.Objects;

public class TimeSlot {
    private final String date;
    private int from, to;

    public TimeSlot(String date, int from, int to) {
        this.date = date;
        this.from = from;
        this.to = to;
    }

    public void reschedule(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public String getDate() {
        return date;
    }
    public int getFrom() {
        return from;
    }
    public int getTo() {
        return to;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TimeSlot)) return false;
        TimeSlot timeSlot = (TimeSlot) o;
        return from == timeSlot.from && to == timeSlot.to && date.equals(timeSlot.date);
    }

    @Override
    public int hashCode() {
        int result = date.hashCode();
        result = 31 * result + from;
        result = 31 * result + to;
        return result;
    }

    @Override protected Object clone() {
        return new TimeSlot(date, from, to);
    }

    @Override
    public String toString() {
        return date + " " + from + "-" + to;
    }
}
