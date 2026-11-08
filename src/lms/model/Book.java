package lms.model;

public class Book extends LibraryItem {
    private String author;
    private String isbn;
    private boolean isBorrowed;

    public Book(String id, String title, String author, String isbn){
        super(id, title);
        setAuthor(author);
        setBorrowed(isBorrowed);
        setIsbn(isbn);
    }

    public String getTitle() {
        return super.getTitle();
    }

    public void setTitle(String title) {
        if(!checkValidate(title)){
            throw new IllegalArgumentException("Title cannot be empty");
        }else{
            super.setTitle(title);
        }
    }

    public void setAuthor(String author) {
        if(!checkValidate(author)){
            throw new IllegalArgumentException("Author cannot be empty");
        }else{
            this.author = author;
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if(!checkValidate(isbn)){
            throw new IllegalArgumentException("ISBN cannot be empty");
        }else{
            this.isbn = isbn;
        }
    }

    public boolean checkValidate(String text){
        if(text == null || text.isBlank()){
            return false;
        }else{
            return true;
        }
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}