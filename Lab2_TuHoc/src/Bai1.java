import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        for(int i =0;i<n;i++){
            System.out.print("Nhập phần tử thứ " + i + ":");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.print("Tổng phần tử của mảng là " + sum);
    }
}
