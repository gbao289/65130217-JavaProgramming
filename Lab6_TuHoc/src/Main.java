import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> list = new ArrayList<>();

        System.out.print("Nhập số sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Tên: ");
            String ten = sc.nextLine();
            System.out.print("Điểm: ");
            double diem = sc.nextDouble();
            sc.nextLine();

            list.add(new SinhVien(ten, diem));
        }

        System.out.println("Sinh viên có điểm >= 8:");
        for (SinhVien sv : list) {
            if (sv.diem >= 8) {
                sv.hienThi();
            }
        }
    }
}