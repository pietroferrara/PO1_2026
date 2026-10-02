public class Book {
    String title;
    String author;
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

    boolean lend() {
        if(available > 0) {
            available = available - 1;
            return true;
        }
        else return false;
    }

    boolean returnBook() {
        if(available < copies) {
            available = available + 1;
            return true;
        }
        else return false;
    }

}
