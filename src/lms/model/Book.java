package lms.model;

public class Book{
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;

    public Book(String title, String author, String isbn){
        setTitle(title);
        setAuthor(author);
        setBorrowed(isBorrowed);
        setIsbn(isbn);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title == null){
            System.out.println("Title cannot be empty");
        }else{
            this.title = title;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if(author == null){
            System.out.println("Author cannot be empty");
        }else{
            this.author = author;
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if(isbn == null){
            System.out.println("ISBN cannot be empty");
        }else{
            this.isbn = isbn;
        }
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        if(borrowed != true && borrowed != false){
            System.out.println("IsBorrowed cannot be empty");
        }else{
            isBorrowed = borrowed;
        }
    }
}