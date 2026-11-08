package lms.service;

import lms.model.Book;
import lms.model.Member;

import java.util.ArrayList;
import java.util.List;

public class Library{
    private final List<Book> books = new ArrayList<>();
    private final List<Member> members = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void addMember(Member member){
        members.add(member);
    }

    public void listBooks(){
        System.out.println("\n-----Books-----");
        for(Book b : books){
            System.out.println(b);
        }
    }

    public void listmembers(){
        System.out.println("\n-----Members-----");
        for(Member m : members){
            System.out.println(m);
        }
    }

    public List<Book> getBooks(){
        return books;
    }

    public List<Member> getMembers(){
        return members;
    }

    public Book findBookByIsbn(String isbn){
        for(Book b : books){
            if(b.getIsbn() == isbn){
                System.out.print("Found : ");
                return b;
            }else{
                System.out.println("Not Found");
                return null;
            }
        }
        return null;
    }

}