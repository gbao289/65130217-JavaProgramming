import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        str = str.trim();

        if (str.isEmpty()) {
            System.out.println("Số từ: 0");
        } else {
            String[] words = str.split("\\s+");
            System.out.println("Số từ: " + words.length);
        }
    }
}