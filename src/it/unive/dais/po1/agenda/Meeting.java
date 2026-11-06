package it.unive.dais.po1.agenda;

import java.util.Objects;

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
}
