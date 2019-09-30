package lab4;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class StudentManager {
    public static Scanner scanner = new Scanner(System.in);
    private List<Student> studentList;
    private StudentDao studentDao;
    public StudentManager() {
        studentDao = new StudentDao();
        studentList = studentDao.read();
    }
    public void add() {
        int id = (studentList.size() > 0) ? (studentList.size() + 1) : 1;
        System.out.println("student id = " + id);
        String name = inputName();
     
        double price = inputprice();
        double SaleOff = inputSaleOff();
        double thue = price/100*10;
        Student student = new Student(id, name, price, SaleOff, thue);
        studentList.add(student);
        studentDao.write(studentList);
    }
    public void show() {
        for (Student student : studentList) {
            System.out.format("%5d | ", student.getId());
            System.out.format("%20s | ", student.getName());
            System.out.format("%20s | ", student.getprice());
            System.out.format("%20s | ", student.getSaleOff());
            System.out.format("%10.1f%n", student.getthue());
        }
    }
    public int inputId() {
        System.out.print("Input student id: ");
        while (true) {
            try {
                int id = Integer.parseInt((scanner.nextLine()));
                return id;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
            }
        }
    }
    private String inputName() {
        System.out.print("Nhập tên sản phẩm: ");
        return scanner.nextLine();
    }
    private float inputprice() {
        System.out.print("Đơn giá: ");
        while (true) {
            try {
                float price = Float.parseFloat((scanner.nextLine()));
                
                return price;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student age again: ");
            }
        }
    }
    private float inputSaleOff() {
        System.out.print("Giảm giá: ");
        while (true) {
            try {
                float SaleOff = Float.parseFloat((scanner.nextLine()));
           
                return SaleOff;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student age again: ");
            }
        }
    }
  
    public List<Student> getStudentList() {
        return studentList;
    }
 
    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}