package it.unive.dais.po1.elevator;

public class Runner {
    public static void main(String[] args) {
        Elevator a = new Elevator(10, 5);
        a.moveTo(4);
        a.board(3);
        a.evacuate();
        System.out.println("Execution ended correctly");
    }
}
