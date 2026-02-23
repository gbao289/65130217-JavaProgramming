import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int max = 0;
        int count = 0;
        for(int i =0;i<n;i++){
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = sc.nextInt();
            sum += arr[i];
            if(arr[i] > max) max = arr[i];
            if(arr[i] % 2 ==0) count ++;
        }
        System.out.println("Mảng sau khi đảo chiều");
        System.out.print("[");
        for(int j = n-1; j>=0;j--){
            System.out.print(arr[j]+",");
        }
        System.out.print("]");
        System.out.println("\nTổng phần tử của mảng là " + sum);
        System.out.println("Phần tử lớn nhất của mảng là " + max);
        System.out.println("Số phần tử chẵn trong mảng là "+count);
    }
}
