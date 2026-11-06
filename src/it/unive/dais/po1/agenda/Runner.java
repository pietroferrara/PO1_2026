package it.unive.dais.po1.agenda;

public class Runner {
    public static void main(String[] args) {
        TimeSlot t = new TimeSlot("2023-01-01", 10, 12);
        Meeting meeting = new Meeting("Meeting", "Room 1", t);
        Meeting meeting2 = new Meeting("Meeting", "Room 1", t);
        if(meeting==meeting2)
            System.out.println("Equals");
        else System.out.println("Not equals");

        if(meeting.equals(meeting2))
            System.out.println("Equals");
        else System.out.println("Not equals");
    }

    private static void printType(Object o) {
        if(o instanceof TimeSlot)
            System.out.println("TimeSlot");
        else if(o instanceof Meeting)
            System.out.println("Meeting");
        else System.out.println("Unknown");
    }
}
