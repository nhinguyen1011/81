package nhi4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DocumentManagement {
    Scanner scanner = new Scanner(System.in);
    private List<Document> documents ;
    ArrayList<Book> arrbook = new ArrayList<>();
    ArrayList<Magazine> arrmagazine= new ArrayList<>();
    ArrayList<Journal> arrjournal = new ArrayList<>();
    int soSach; int  soTapchi ;int  soBao ;

    public void add (){
        System.out.print("nhap so sach: ");
        int soSach = scanner.nextInt();
        System.out.print("nhap so tap chi: ");
        int soTapchi = scanner.nextInt();
        System.out.println("nhap thong tin so bao: ");
        int soBao = scanner.nextInt();

        System.out.println("nhap thong tin so sach: ");
        for (int i = 0; i < soSach; i++) {
                System.out.println("nhap thong tin quyen sach thu" + (i + 1) + ": ");
                Book book = new Book();
                book.input();
                arrBook.add(book);
            }
        for (int i = 0; i < soTapchi; i++) {
            System.out.println("nhap thong tin quyen tap chi thu" + (i + 1) + ": ");
            Magazine magazine  = new Magazine();
            magazine .input();
            arrMagazine.add(magazine);
        }
        for (int i = 0; i < soBao; i++) {
            System.out.println("nhap thong tin quyen tap chi thu" + (i + 1) + ": ");
            Journal journal  = new Journal();
            journal.input();
            arrJournal.add(journal);
        }
    }

    public void show() {
        System.out.println("thong tin sach");
        for (int i = 0; i < arrBook.size(); i++) {
            System.out.println(arrBook.get(i).toString());
        }

        System.out.println("thong tin tap chi");
        for (int i = 0; i < arrMagazine.size(); i++) {
            System.out.println(arrMagazine.get(i).toString());
        }

        System.out.println("thong tin bao");
        for (int i = 0; i < arrJournal.size(); i++) {
            System.out.println(arrJournal.get(i).toString());
        }

    }

}

