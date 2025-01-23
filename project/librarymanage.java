package project;
class books{
    private String bname;
   private String author_name;
    private String isbn;
    private boolean isAvailable;
    books(String bname,String author_name,String isbn){
        this.bname = bname;
        this.author_name=author_name;
        this.isbn=isbn;
        this.isAvailable=true;
    }
    public String getbname(){ return bname;}
    public String getauther_name(){return author_name;}
    public String getisbn(){return isbn;}
    public boolean getisAvailable(){return isAvailable;}
    public void setisAvailable(boolean isAvailable){this.isAvailable=isAvailable;}
    public String toString() {
        return "Book{" + "bname='" + bname + '\'' + ", author_name='" + author_name + '\'' +
                ", isbn='" + isbn + '\'' + ", isAvailable=" + isAvailable + '}';
}
}
public class librarymanage {
    public static void main(String[] args) {
        
    }
}
