import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ban kinh r: ");

        double r = scanner.nextDouble();

        if (r >= 0 && r <= 1000) {
            double chuVi = 2 * 3.14 * r;
            double dienTich = 3.14 * r * r;
            System.out.printf("Chu vi hinh tron la: %.3f\n", chuVi);
            System.out.printf("Dien tich hinh tron la: %.3f\n", dienTich);
        }
    }
}