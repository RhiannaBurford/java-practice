public class Book {
    private String name;
    private String ISBN;
    private String author;
    private String publisher;

    public Book(String name, String ISBN, String author, String publisher){
        this.name = name;
        this.ISBN = ISBN;
        this.author = author;
        this.publisher = publisher;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    
    public String getName(){
        return this.name;
    }
    public String getISBN(){
        return this.ISBN;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getPublisher(){
        return this.publisher;
    }
    public void getBookInfo(){
        System.out.printf("%s %s %s %s", this.name, this.ISBN, this.author, this.publisher);
    }
}
