package lms;

import lms.model.Book;
import lms.model.DVD;
import lms.model.LibraryItem;
import lms.model.Member;
import lms.service.Library;

public class Main {
    void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book("B001","Clean Code", "Robert C. Martin", "978-0132350884");
        Book b2 = new Book("B002","Effective Java", "Joshua Bloch", "978-0134685991");
        DVD d1 = new DVD("D001", "Introduction to Algorithms", 120);
        //LibraryItem item = d1;
        //item.getDurationMinutes(d1);

        library.addItem(b1);
        library.addItem(b2);
        library.addItem(d1);

        LibraryItem same = b1;
        System.out.print("Same Book 1 Adding with Overloading : ");
        library.addItem(same);

        library.addMember(new Member("M001", "Kasun", 4));
        library.addMember(new Member("M002", "Sahan", 3));

        library.listItems();
        library.listmembers();

        library.printAllLateFees(5);

        library.streamIfPossible(d1);
        library.streamIfPossible(b1);

        try{
            library.addItem(new Book("B003","Clean Code", "", "978-0132350884"));
        }catch(IllegalArgumentException e){
            System.out.println("\nRejected Invalid Book : " + e.getMessage());
        }

        try{
            library.addMember(new Member("M001", "Kasun", -4));
        }catch(IllegalArgumentException e){
            System.out.println("Rejected Invalid Member : " + e.getMessage());
        }

        System.out.print("\nFinding a book via ISBM : ");
        System.out.print(library.findBookByIsbn("978-0132350884"));


    }
}