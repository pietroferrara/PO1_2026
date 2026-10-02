public class Tester {

    public static void main(String[] args) {
        Book b = new Book();
        b.title = "Java";
        b.author = "Pietro";
        b.buyCopies(-3);
        int copieprestate = 0;

        if(b.lend()==true) {
            copieprestate++;
        }
        if(b.lend()==true) {
            copieprestate++;
        }
        if(b.lend()==true) {
            copieprestate++;
        }
        if(b.lend()==true) {
            copieprestate++;
        }
        if(b.lend()==true) {
            copieprestate++;
        }
        b.returnBook();
        b.returnBook();
        b.returnBook();
        b.returnBook();
        b.returnBook();
        System.out.println("Titolo:"+b.title);
        System.out.println("Autore:"+b.author);
        System.out.println("Copie:"+b.copies);
        System.out.println("Disponibili:"+b.available);
        System.out.println("Copie prestate:"+copieprestate);


        Book b1 = new Book();
        b1.title = "Java 25 LTS";
        b1.author = "Mario";
        b1.buyCopies(5);


    }

}
