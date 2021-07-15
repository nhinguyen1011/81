package nhi4;
import java.util.Scanner;
public class AppTest {
    public static void main(String[] args) {
        int choiceNumber;
        DocumentManagement documentManagement = new DocumentManagement();
        Scanner scanner = new Scanner(System.in);
        boolean choice = true;
        System.out.println("1:Thêm mới tài liệu");
        System.out.println("2:Hiển thị thông tin về tài liệu");
        System.out.println("3:Xoá tài liệu theo mã tài liệu");
        System.out.println("4:Tìm kiếm tài liệu theo thể loại");
        System.out.println("5:Thoát khỏi chương trình");
        System.out.println("Bấm số để chọn (1/2/3/4/5): ");
        choiceNumber = scanner.nextInt();
        while (choice) {
            switch (choiceNumber) {
                case 1:
                    System.out.println("Bạn chọn chức năng thêm!");
                    documentManagement.add();
                    break;
                case 2:
                    System.out.println("Bạn chọn chức năng hiển thị!");
                    documentManagement.show();
                    break;
                case 3:
                    System.out.println("Bạn chọn chức năng xoá");
                    documentManagement.delete();
                    break;
                case 4:
                    System.out.println("Bạn chọn chức năng tìm kiếm");
                    documentManagement.delete();
                    break;
                case 5:
                    System.out.println("Bạn chọn chức năng thoát");
                    documentManagement.exit();
                    break;
                default:
                    System.out.println("Nhập lại chức năng");    
                    break;
            }
        }
    }
}



