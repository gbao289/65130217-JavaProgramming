public class Main {
    public static void main(String[] args) {

        System.out.println(XPoly.sum(1, 2, 3));        // 6.0
        System.out.println(XPoly.sum(5.5, 4.5));      // 10.0
        System.out.println(XPoly.sum());              // 0.0

        System.out.println("Min: " + XPoly.min(3, 7, 2, 9, -1));
        System.out.println("Max: " + XPoly.max(3, 7, 2, 9, -1));

        System.out.println("Min: " + XPoly.min(5.5, 2.1, 9.8));
        System.out.println("Max: " + XPoly.max(5.5, 2.1, 9.8));
    }
}