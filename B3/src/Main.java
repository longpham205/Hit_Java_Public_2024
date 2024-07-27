import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Nhap so n (0<n<50): ");
            n = scanner.nextInt();
            if (0>n || n>50){
                System.out.print("Ko thoa man!\nNhap lai!\n");
            }
        }
        while(0>n || n>50);
        
        int[][] MaTran = new int[n][n];

        int HangBD = 0;
        int HangKT = n - 1;
        int CotBD = 0;
        int CotKT = n - 1;
        int GiaTri = 1;

        while (HangBD <= HangKT && CotBD <= CotKT) {
            for (int i = CotBD; i <= CotKT; i++) {
                MaTran[HangBD][i] = GiaTri++;
            }
            HangBD++;

            for (int i = HangBD; i <= HangKT; i++) {
                MaTran[i][CotKT] = GiaTri++;
            }
            CotKT--; 

            if (HangBD <= HangKT && CotBD <= CotKT) {
                for (int i = CotKT; i >= CotBD; i--) {
                    MaTran[HangKT][i] = GiaTri++;
                }
                HangKT--;
            }

            if (HangBD <= HangKT && CotBD <= CotKT) {
                for (int i = HangKT; i >= HangBD; i--) {
                    MaTran[i][CotBD] = GiaTri++;
                }
                CotBD++;
            }
        }

        System.out.print("Ma tran xoan oc:\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(MaTran[i][j] + " ");
            }
            System.out.println();
        }
    }
}