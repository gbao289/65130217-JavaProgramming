import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount acc1 = new BankAccount("001", "Bao", 5000);
        BankAccount acc2 = new BankAccount("002", "An", 3000);

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nap tien");
            System.out.println("2. Rut tien");
            System.out.println("3. Chuyen tien");
            System.out.println("4. Hien thi so du");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhap so tien nap: ");
                    double nap = sc.nextDouble();
                    acc1.deposit(nap);
                    break;

                case 2:
                    System.out.print("Nhap so tien rut: ");
                    double rut = sc.nextDouble();
                    acc1.withdraw(rut);
                    break;

                case 3:
                    System.out.print("Nhap so tien chuyen: ");
                    double chuyen = sc.nextDouble();
                    acc1.transfer(acc2, chuyen);
                    break;

                case 4:
                    acc1.display();
                    acc2.display();
                    break;
            }

        } while (choice != 0);

        System.out.println("Tam biet!");
    }
}