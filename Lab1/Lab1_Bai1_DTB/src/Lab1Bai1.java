import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Lab1Bai1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Điểm trung bình: ");
        double diemTB = Double.parseDouble(scanner.nextLine());
        System.out.printf("Sinh viên: %s\nĐiểm trung bình: %.1f",hoTen,diemTB);
        }
    }
