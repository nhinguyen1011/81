package nhi4;

import java.util.Scanner;

public class Magazine extends Document{
    private int issueNumber;
    private int numberPage;


    public Magazine(  int issueNumber, int numberPage) {
        super();
        this.issueNumber=issueNumber;
        this.numberPage = numberPage;
    }
    public Magazine(){

    }
    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issueNumber=" + issueNumber +
                ", numberPage=" + numberPage +
                '}';
    }
    public void input() {
        super.input();
        System.out.println("enter the issuenumber: ");
        issueNumber=scanner.nextInt();
        System.out.println("enter the numberpage: ");
        numberPage = scanner.nextInt();;
    }
}
