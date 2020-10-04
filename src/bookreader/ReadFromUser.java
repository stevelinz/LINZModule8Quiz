package bookreader;
/*
Book Reader Template Method Instructions
Modify the class ReadFromFile according to the comments in its three methods.
Create a concrete class, ReadFromUser, that extends BookReader.
Steve Linz
 */

import java.util.Scanner;

public class ReadFromUser extends BookReader {

    private Franky theBook;
    String review;

    @Override
        // The initialize() method should prompt the
        ///  user to enter lines of text and gather the input.
    void initialize() {


        System.out.print("Type your review of the book " +
                "hit enter when done type (q) then the enter key  ");
        System.out.println();
        Scanner kB = new Scanner(System.in);
        String tempString = " ";
        String currentString = " ";
        review = kB.nextLine();


        while (!review.equals("q")) {
            currentString = tempString + "\n" + review;
            tempString = currentString;
            review = kB.nextLine();
        }
        System.out.println();
        review = currentString;
        theBook = new Franky();
    }


    @Override
        //The startReading() method should print the
        // user's text to standard output.
    void startReading() {

        System.out.println(review);
        System.out.println();
        theBook.outputBook();

    }


    @Override
        //The stopReading() method can be empty.
    void stopReading() {

    }


}


