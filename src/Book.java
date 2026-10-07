public class Book {
    String title;
    Author author;
    //copies >= 0 && available <= copies
    int copies;
    //available >= 0 && available <= copies
    int available;

    void buyCopies(int i) {
        if(i > 0) {
            copies = copies + i;
            available = available + i;
        }
    }

    boolean lend(Member m) {
        if(available > 0) {
            if (m.borrow()) {
                available = available - 1;
                //m.loans = m.loans + 1;
                return true;
            }
            else return false;
        }
        else return false;
    }

    boolean returnBook(Member m) {
        if(available < copies) {
            if(m.returnBook()) {
                available = available + 1;
                return true;
            }
            else return false;
        }
        else return false;
    }

    String description() {
        return title + " by " + author.name + " " + author.surname;
    }

}
