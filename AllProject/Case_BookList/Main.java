package Case_BookList;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet< Book> books=new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getBookName().compareTo(o2.getBookName());
            }
        });


        Book book1=new Book("Lord of the rings",250,"J.R.R Tolkein",1954);
        Book book2=new Book("To Kill a Mockingbird",350,"Harper Lee",1960);
        Book book3=new Book(" In Search of Lost Time",480,"Marcel Proust",1978);
        Book book4=new Book("Gİnce Mehmet",580,"Yaşar Kemal",1995);
        Book book5=new Book("Nutul",630,"Mustafa Kemal Atatürk",1937);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);


        //List by Book Name
        for (Book bookEch:books
             ) {
            System.out.println("Book Name: "+bookEch.getBookName()+"\nWriter Name:"+
                    bookEch.getWriterName()+"\nPaper No:"+bookEch.getPeaperNo()+"\nReals Date"+bookEch.getRealseDate());
            System.out.println("=======================================");

        }
        TreeSet<Book>book=new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPeaperNo()- o2.getPeaperNo();
            }
        });

        book.add(book1);
        book.add(book2);
        book.add(book3);
        book.add(book4);
        book.add(book5);


        System.out.println("");
        System.out.println("");
        System.out.println("////////////////////////////");///List by paper no
        System.out.println("");
        System.out.println("");
        for (Book bookPeper:book
             ) { System.out.println("\nPaper No:"+bookPeper.getPeaperNo()+"\nBook Name: "+bookPeper.getBookName()+"\nWriter Name:"+
                bookPeper.getWriterName()+"  \nReals Date"+bookPeper.getRealseDate());
            System.out.println("=======================================");



        }



    }





}
