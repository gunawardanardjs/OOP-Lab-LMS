package lms.model;

public abstract class LibraryItem {
    private String id;
    private String title;
    private boolean isBorrowed;

    public LibraryItem(String id, String title){
        setId(id);
        setTitle(title);
        this.isBorrowed = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(!validateText(id)){
            throw new IllegalArgumentException("ID cannot be empty");
        }else{
            this.id = id;
        }
    }

    public String getTitle() {
        return title;
    }

    public boolean validateText(String text){
        if(text == null || text.isBlank()){
            return false;
        }else{
            return true;
        }
    }

    public void setTitle(String title) {
        if(!validateText(title)){
            throw new IllegalArgumentException("Title cannot be empty");
        }else{
            this.title = title;
        }
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowItem() {
        isBorrowed = true;
    }

    public void returnItem() {
        isBorrowed = false;
    }

    public double calculateLateFee(int daysLate) {
        if(daysLate < 0){
            throw new IllegalArgumentException("Late fee cannot be negative");
        }else{
            return daysLate * 10.0;
        }
    }

    @Override
    public String toString() {
        return "LibraryItem{" + "id='" + id + '\'' + ", title='" + title + '\'' + ", isBorrowed=" + isBorrowed + '}';
    }
}
