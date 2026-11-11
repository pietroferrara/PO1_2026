package it.unive.dais.po1.agenda.runner;

import it.unive.dais.po1.agenda.Meeting;
import it.unive.dais.po1.agenda.TimeSlot;

public class Runner {
    public static void main(String[] args) {
        TimeSlot t = new TimeSlot("2023-01-01", 10, 12);
        TimeSlot t1 = new TimeSlot("2023-01-02", 9, 13);
        TimeSlot t2 = new TimeSlot("2023-02-01", 13, 17);
        Meeting meeting = new Meeting("Meeting", "Room 1", t);
        Meeting meeting2 = new Meeting("Meeting", "Room 1", t);
        Meeting meeting3 = new Meeting("Meeting on Jan 2nd", "Room 1", t1);
        Meeting meeting4 = new Meeting("Meeting on Jan 3rd", "Room 1", t2);

        Meeting meeting5 = (Meeting) meeting2.clone();

        //meeting2.getSlot().reschedule(18, 20);

        //System.out.println(meeting2.equals(meeting5));


        System.out.println("The last meeting is "+meeting3);
        String.valueOf(meeting3);

/*
        Object meeting3 = meeting2;
        if(meeting==meeting2)
            System.out.println("Equals");
        else System.out.println("Not equals");

        if(meeting.equals(meeting2))
            System.out.println("Equals");
        else System.out.println("Not equals");

        if(meeting.equals(meeting3))
            System.out.println("Equals");
        else System.out.println("Not equals");*/

/*        HashSet<Meeting> agenda = new HashSet<>();
        agenda.add(meeting);
        agenda.add(meeting2);
        agenda.add(meeting3);
        agenda.add(meeting4);
        agenda.add(meeting2);
        agenda.add(meeting3);
        agenda.add(meeting4);
        System.out.println(agenda.size());*/

    }

    private static void printType(Object o) {
        if(o instanceof TimeSlot)
            System.out.println("TimeSlot");
        else if(o instanceof Meeting)
            System.out.println("Meeting");
        else System.out.println("Unknown");
    }
}
