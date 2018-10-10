package com.lahey;
import java.util.ArrayList;

/**
 * @author jack lahey
 *
 * Assignment
 * Using the code from the previous "Inheritance completion activity #1",
 * create an override of the equals class for the superclass, and Book and Software subclasses.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Product> list = new ArrayList<Product>();

        Book b1 = new Book();
        b1.setCode("book001");
        b1.setDescription("This is a book");
        b1.setPrice(44.95);
        b1.setAuthor("Kipling");
        b1.setPages(345);
        list.add(b1);

        Book b3 = new Book();
        b3.setCode("book001");
        b3.setDescription("This is a book");
        b3.setPrice(44.95);
        b3.setAuthor("Kipling");
        b3.setPages(345);
        list.add(b3);

        Book b2 = new Book();
        b2.setCode("book002");
        b2.setDescription("This is a great book");
        b2.setPrice(4418.55);
        b2.setAuthor("Kurosowa");
        b2.setPages(345);
        list.add(b2);

        Software s1 = new Software();
        s1.setCode("soft001");
        s1.setDescription("This is a software");
        s1.setPrice(44.95);
        s1.setProgrammer("Mark Shuttleworth");
        s1.setPlatform("linux");
        s1.setOs("Ubuntu");
        list.add(s1);

        Software s2 = new Software();
        s2.setCode("soft001");
        s2.setDescription("This is a software");
        s2.setPrice(44.95);
        s2.setProgrammer("Bob Young");
        s2.setPlatform("linux");
        s2.setOs("Red Hat");
        list.add(s2);

        //display product count
        System.out.printf("There are %d Products\n", Product.getCount());

        if( b1.equals(b3)){
            System.out.println("b1 == b3");
        }
        else
        {
            System.out.println("b1 != b3");
        }
        if( s1.equals(s2)){
            System.out.println("s1 == s2");
        }
        else
        {
            System.out.println("s1 != s2");
        }


        //for-each product display characteristics
        for(Product p : list)
        {
            System.out.println("\n");
            System.out.print(p.toString());
            if(p instanceof Book)
            {
                System.out.println("Author:\t" + ((Book)p).getAuthor());
                System.out.println("Pages:\t" + ((Book)p).getPages());
            }
            if(p instanceof Software)
            {
                System.out.println("Programmer:\t" + ((Software)p).getProgrammer());
                System.out.println("Platform:\t" + ((Software)p).getPlatform());
                System.out.println("OS:\t" + ((Software)p).getOs());
            }

        }//end for(Product p : list)

    }//end public static void main(String[] args)

}//end public class Main
