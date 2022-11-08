package ca1Prep;

public class Book {

    //Variables
    private String name;
    private String author;
    private String genre;
    private int ISBN;
    private char status;
    private static int noOfBooks = 0;
    private static int nextISBN = 1;


    //Constructors

    public Book(String name, String author, String genre) {
        setName(name);
        setAuthor(author);
        setGenre(genre);
        setStatus('A');
        setISBN(nextISBN);
        nextISBN++;
        noOfBooks++;
    }



    //Getters and Setters

     public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    } 
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getISBN() {
        return ISBN;
    }
    public void setISBN(int ISBN) {
        ISBN = ISBN;
    }
    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    //toString
    

    //Misc
    public void borrow() {
        setStatus('B');
    }

   
}