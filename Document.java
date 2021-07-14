package nhi4;
import java.util.Scanner;
public class Document {
    private String id;
    private String publisher;
    private int number;

    Scanner scanner = new Scanner(System.in);
    public Document() {
        super();
    }

    public Document(String id,String publisher,int  number,) {
        this.id = id;
        this.publisher = publisher;
        this.number = number;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id='" + id + '\'' +
                ", publisher='" + publisher + '\'' +
                ", number=" + number +
                ", scanner=" + scanner +
                '}';
    }
    public void input(){
        System.out.println("enter the id of the book"+index+": ");
        id = scanner.nextLine();
        System.out.println("enter the id"+index+": ");
        publisher =  scanner.nextLine();
        System.out.println("enter the id"+index+": ");
        number = scanner.nextInt();
    }
}