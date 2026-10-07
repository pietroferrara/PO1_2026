public class Tester {

    public static void main(String[] args) {
        /*Author pietro = new Author();
        pietro.name = "Pietro";
        pietro.surname = "Ferrara";
        pietro.birthYear = 1981;*/
        Member tino = new Member();
        tino.name = "Agostino";
        tino.surname = "Cortesi";
        tino.birthYear = 1971;


        Member pietro2 = new Member();
        pietro2.name = "Pietro";
        pietro2.surname = "Ferrara";
        pietro2.birthYear = 1981;

        System.out.println(Member.numberOfMembers);

        /*Book b = new Book();
        b.title = "Java";
        b.author = pietro;
        b.buyCopies(3);


        Book b1 = new Book();
        b1.title = "Chess games";
        b1.author = pietro;
        b1.buyCopies(1);

        System.out.println(tino.description());
        b.lend(tino);
        System.out.println(tino.description());
        b1.lend(tino);
        System.out.println(tino.description());
        b1.returnBook(tino);
        System.out.println(tino.description());




        System.out.println(b.description());
        System.out.println(b1.description());*/

        /*int copieprestate = 0;

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

*/
    }

}
