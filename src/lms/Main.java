package lms;

import lms.model.Book;
import lms.model.Member;
import lms.service.Library;

public class Main {
    void main(String[] args) {
        Library library = new Library();

        try{
            library.addBook(new Book("Clean Code", "Robert C. Martin", "978-0132350884"));
            library.addBook(new Book("Effective Java", "Joshua Bloch", "978-0134685991"));

            library.addMember(new Member("M001", "Kasun", 4));
            library.addMember(new Member("M002", "Sahan", 3));

            library.listBooks();
            library.listmembers();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try{
            library.addBook(new Book("Clean Code", "", "978-0132350884"));
        }catch(IllegalArgumentException e){
            System.out.println("Rejected Invalid Book : " + e.getMessage());
        }

        try{
            library.addMember(new Member("M001", "Kasun", -4));
        }catch(IllegalArgumentException e){
            System.out.println("Rejected Invalid Member : " + e.getMessage());
        }

        System.out.println("Finding a book via ISBM");
        System.out.println(library.findBookByIsbn("978-0132350884"));

        library.getBooks().add(new Book("Shelok", "ABC", "14564"));

    }
}