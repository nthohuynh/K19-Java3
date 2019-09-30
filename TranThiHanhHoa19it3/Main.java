package lab4;
import java.util.Scanner;
public class Main {
    public static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        StudentManager studentManager = new StudentManager();
        int studentId;
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
            case "1":
                studentManager.add();
                break;
            case "2":
                studentManager.show();
                break;
            case "3":
                System.out.println("exited!");
                exit = true;
                break;
            default:
                System.out.println("Vui lòng chọn chức năng trong menu:");
                break;
            }
            if (exit) {
                break;
            }
            showMenu();
        }
    }
    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Thêm sản phẩm.");
        System.out.println("2. Xem sản phẩm.");
        System.out.println("3. exit.");
        System.out.println("---------------------------");
        System.out.print("Vui lòng chọn: ");
    }
}