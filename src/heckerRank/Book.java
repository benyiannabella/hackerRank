package heckerRank;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();

    public static void main(String[] args) {
        Book book = new MyBook("Harry potter", "J.K. Rowling", 20);
        book.display();
    }
}

class MyBook extends Book{

    private int price;

    public MyBook(String title, String author, int price){
        super(title, author);
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
}
