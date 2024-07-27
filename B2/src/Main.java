import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chieu dai mang n: ");
        int n = scanner.nextInt();

        if (n <= 0 || n > 10000) {
            return;
        }

        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("A[" +i +"]=");
            A[i] = scanner.nextInt();
            if (Math.abs(A[i]) > 100000000) {
                return;
            }
        }
        for (int i = 0; i < n; i++) {
            int chenhLech = 0;
            if (i == 0) {
                chenhLech = A[1];
            } else if (i == n - 1) {
                chenhLech = A[n - 2];
            } else {
                chenhLech = Math.abs(A[i + 1] - A[i - 1]);
            }
            A[i] += chenhLech;
        }
        System.out.print("Mang sau khi bien doi:\n");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}