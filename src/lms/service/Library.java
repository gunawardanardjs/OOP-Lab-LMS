package lms.service;

import lms.model.Book;
import lms.model.DVD;
import lms.model.LibraryItem;
import lms.model.Member;

import java.util.ArrayList;
import java.util.List;

public class Library{
    private final List<LibraryItem> items = new ArrayList<>();
    private final List<Member> members = new ArrayList<>();

    public void addItem(LibraryItem item){
        items.add(item);
        System.out.println("Added the item " + item.getTitle());
    }

    public void addBook(Book book){
        items.add(book);
        System.out.println("Added the book " + book.getTitle());
    }

    public void addItem(DVD dvd){
        items.add(dvd);
        System.out.println("Added the DVD " + dvd.getTitle());
    }

    public void addMember(Member member){
        members.add(member);
    }

    /*public void listBooks(){
        System.out.println("\n-----Books-----");
        for(Book b : books){
            System.out.println(b);
        }
    }*/

    public void listItems(){
        System.out.println("-----Items in the Library-----");
        for(LibraryItem item : items){
            System.out.println(item);
        }
    }

    public void listmembers(){
        System.out.println("\n-----Registered Members-----");
        for(Member m : members){
            System.out.println(m);
        }
    }

    public List<LibraryItem> getItems(){
        return items;
    }

    public List<Member> getMembers(){
        return members;
    }

    public Book findBookByIsbn(String isbn) {
        for (LibraryItem item : items) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (isbn != null && isbn.equals(book.getIsbn())) {
                    System.out.println("Book found");
                    return book;
                }
            }
        }
        System.out.println("Book Not Found");
        return null;
    }

    public void printAllLateFees(int daysLate) {
        System.out.println("Late fees if " + daysLate + " days late : ");
        for (LibraryItem item : items) {
            System.out.println(item.getTitle() + " : " + item.calculateLateFee(daysLate));
        }
    }

}