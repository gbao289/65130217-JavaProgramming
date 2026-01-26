import java.util.Scanner;

public class Lab1Bai4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("b: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.print("c: ");
        int c = Integer.parseInt(scanner.nextLine());
        double delta = Math.pow(b,2) - 4 * a * c;
        if(delta < 0) System.out.print("Delta <0, phương trình vô nghiệm");
        else if(delta == 0){
            System.out.print("Delta = 0, phương trình có nghiệm kép\n");
            System.out.printf("Căn delta: %.2f", Math.sqrt(delta));
        }
        else {
            System.out.printf("Căn delta: %.2f", Math.sqrt(delta));
        }
    }
}
