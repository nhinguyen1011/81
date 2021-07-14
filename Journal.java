package nhi4;

public class Journal extends Document {
    private int dayIssue;

    public Journal(int dayIssue) {

        this.dayIssue =dayIssue;
    }

    public Journal() {
    }

    public int getDayIssue() {
        return dayIssue;
    }

    public void setDayIssue(int dayIssue) {
        this.dayIssue = dayIssue;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "dayIssue=" + dayIssue +
                '}';
    }

    public void input() {
        super.input();
        System.out.println("enter the issuenumber: ");
        dayIssue = scanner.nextInt();
    }
}

