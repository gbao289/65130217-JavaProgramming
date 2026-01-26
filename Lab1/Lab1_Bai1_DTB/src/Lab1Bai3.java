import java.util.Scanner;

public class Lab1Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cạnh: ");
        int canh = Integer.parseInt(scanner.nextLine());
        double theTich = Math.pow(canh, 3);
        System.out.printf("Thể tích: %.2f m3",theTich);
    }
}

