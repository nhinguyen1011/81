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

        System.out.println("nhap thong tin so sach");
        for (int i = 0; i < soSach; i++) {
                System.out.println("nhap thong tin quyen sach thu " + (i + 1) );
                Book book = new Book();
                book.input();
                arrbook.add(book);
            }
        for (int i = 0; i < soTapchi; i++) {
            System.out.println("nhap thong tin quyen tap chi thu" + (i + 1) );
            Magazine magazine  = new Magazine();
            magazine .input();
            arrmagazine.add(magazine);
        }
        for (int i = 0; i < soBao; i++) {
            System.out.println("nhap thong tin quyen tap chi thu" + (i + 1) );
            Journal journal  = new Journal();
            journal.input();
            arrjournal.add(journal);
        }
    }

    public void show() {
        System.out.println("thong tin sach");
        for (int i = 0; i < arrbook.size(); i++) {
            System.out.println(arrbook.get(i));
        }

        System.out.println("thong tin tap chi");
        for (int i = 0; i < arrmagazine.size(); i++) {
            System.out.println(arrmagazine.get(i));
        }

        System.out.println("thong tin bao");
        for (int i = 0; i < arrjournal.size(); i++) {
            System.out.println(arrjournal.get(i));
        }
    }

    public void delete(){
        System.out.println("nhap ma tai lieu muon xoa: ");
        String reid = scanner.nextLine();

        System.out.println("xoa thong tin sach");
        for (int i = 0; i < documents.size(); i++) {
            if(documents.get(i).getId()==reid){
                System.out.println(arrbook.remove(i));
                System.out.println(arrmagazine.remove(i));
                System.out.println(arrjournal.remove(i));
            }
        }
    }

    public void find(){
        System.out.println("nhap the loai ban muon tim: ");
        String kind = scanner.nextLine();

        System.out.println("the loai ban muon tim");
        for (int i = 0; i < documents.size(); i++) {
            if(documents.get(i).toString()==kind){
                System.out.println(arrbook.get(i));
                System.out.println(arrmagazine.get(i));
                System.out.println(arrjournal.get(i));
            }
        }
    }

    public void exit(){
        System.exit(0);
    }
}

