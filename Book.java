package nhi4;

import java.util.Scanner;

public class Book extends Document {
    private String author;
    private int numberPage;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    public Book(String author, int numberPage) {
        super();
        this.author = author;
        this.numberPage=numberPage;
    }

    public Book(){

    }

    @Override
    public String toString() {
        return "Bookone{" +
                "author='" + author + '\'' +
                ", numberPage=" + numberPage +
                '}';
    }
    public void input() {
        super.input();
        System.out.println("enter the author: ");
        author = scanner.nextLine();
        System.out.println("enter the numberpage: ");
        numberPage=scanner.nextInt();
    }
}
