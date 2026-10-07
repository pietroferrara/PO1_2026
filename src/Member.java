public class Member {
    String name;
    String surname;
    int birthYear;
    static int numberOfMembers = 10;
    int cardNumber = incrementMembers();

    int maxLoans = 6;
    int loans = 0;

    static {
        System.out.println("I am initializing the library, no member so far");
        Member.numberOfMembers = 1;
    }

    static int incrementMembers() {
        numberOfMembers = numberOfMembers + 1;
        return numberOfMembers-1;
    }

    String description() {
        return name + " " + surname + " ("+cardNumber+") has "+loans + " loans";
    }

    boolean borrow() {
        if(loans < maxLoans) {
            loans = loans + 1;
            return true;
        }
        else return false;
    }

    boolean returnBook() {
        if(loans > 0) {
            loans = loans - 1;
            return true;
        }
        else return false;
    }
}
