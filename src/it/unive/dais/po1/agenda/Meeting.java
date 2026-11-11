package it.unive.dais.po1.agenda;

import java.util.Objects;
import java.util.Random;

public class Meeting {
    private final String title;
    private final String room;
    private final TimeSlot slot;

    public Meeting(String title, String room, TimeSlot slot) {
        this.title = title;
        this.room = room;
        this.slot = slot;
    }

    public String getTitle() {
        return title;
    }

    public String getRoom() {
        return room;
    }

    public TimeSlot getSlot() {
        return slot;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Meeting)) return false;
        Meeting meeting = (Meeting) o;
        return title.equals(meeting.title) && room.equals(meeting.room) && slot.equals(meeting.slot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, room, slot);
    }

    @Override public Object clone() {
        //deep
        return new Meeting(title, room, (TimeSlot) slot.clone());
        //shallow
        //return new Meeting(title, room, slot);
    }

    @Override public String toString() {
        return "Meeting: \""+title+"\" " + room + " " + slot;
    }
}
