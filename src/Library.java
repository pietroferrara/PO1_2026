public class Library {
    public static void main(
            String[] args) {
        Book book = new Book();
        book.title =
                "The Name of the Rose";
        book.buyCopies(2);
        book.lend();
    }
}
