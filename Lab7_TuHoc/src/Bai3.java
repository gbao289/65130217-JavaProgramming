import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập họ tên: ");
        String str = sc.nextLine().trim().toLowerCase();

        String[] words = str.split("\\s+");
        String result = "";

        for (String word : words) {
            result += Character.toUpperCase(word.charAt(0))
                    + word.substring(1) + " ";
        }

        System.out.println("Tên chuẩn hóa: " + result.trim());
    }
}