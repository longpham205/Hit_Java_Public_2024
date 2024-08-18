import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số chuỗi T: ");
        int T = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < T; i++) {
            System.out.println("Nhập chuỗi:");
            String input = scanner.nextLine();
            int spaceCount = 0;

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == ' ') {
                    spaceCount++;
                }
            }

            System.out.println("Số khoảng trống: " + spaceCount);
        }
    }
}