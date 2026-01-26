import java.util.Scanner;

public class Lab1Bai2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chiều dài: ");
        double chieuDai = Double.parseDouble(scanner.nextLine());
        System.out.print("Chiều rộng: ");
        double chieuRong = Double.parseDouble(scanner.nextLine());
        double chuVi = (chieuDai + chieuRong) * 2;
        double dienTich = chieuDai * chieuRong ;
        double canhMin = Math.min(chieuDai, chieuRong);
        System.out.printf("Hình chữ nhật với chiều dài là %.2f cm và chiều rộng là %.2f cm có:\n",chieuDai,chieuRong);
        System.out.printf("Chu vi: %.2f\nDiện tích: %.2f\nCạnh nhỏ nhất: %.2f",chuVi,dienTich,canhMin);
    }
}
