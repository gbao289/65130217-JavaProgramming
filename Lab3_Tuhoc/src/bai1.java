import java.util.ArrayList;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số: ");
            list.add(sc.nextInt());
        }

        System.out.println("Danh sách vừa nhập:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        //Tim max
        int max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("\nSố lớn nhất: " + max);

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) < 0) {
                list.remove(i);
            }
        }
        //Xoa so am khoi danh sach
        System.out.println("Danh sách sau khi xóa số âm:");
        System.out.println(list);
        //Dem so lan xuat hien cua 1 so
        System.out.print("Nhập số cần đếm: ");
        int x = sc.nextInt();
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == x) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện: " + count);
    }
}