import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mobile[] mobiles = new Mobile[5];
        mobiles[0] = new Mobile("M001", "iPhone 13", 1000.00, 3, "Apple", 4);
        mobiles[1] = new Mobile("M002", "Galaxy S21", 800.00, 2, "Samsung", 8);
        mobiles[2] = new Mobile("M003", "Pixel 5", 600.00, 4, "Google", 6);
        mobiles[3] = new Mobile("M004", "Xperia 1", 900.00, 1, "Sony", 8);
        mobiles[4] = new Mobile("M005", "OnePlus 9", 750.00, 5, "OnePlus", 12);

        Arrays.sort(mobiles, Comparator.comparingDouble(Mobile::getTotalPrice));

        System.out.printf("%-15s %-20s %-10s %-10s %-15s %-10s %-15s %-15s%n",
                "Product ID", "Name", "Price", "Total",
                "Manufacturer", "RAM (GB)", "Base Total", "Final Total");
        System.out.println("-----------------------------------------------------------------------------------------------       -----------");

        for (Mobile mobile : mobiles) {
            System.out.printf("%-15s %-20s %-10.2f %-10d %-15s %-10d %-15.2f %-15.2f%n",
                    mobile.getProductId(), mobile.getProductName(),
                    mobile.getProductPrice(), mobile.getProductTotal(),
                    mobile.getMobileManufacturer(), mobile.getMobileRam(),
                    mobile.getProductPrice() * mobile.getProductTotal(),
                    mobile.getTotalPrice());
        }

        Scanner scanner = new Scanner(System.in);
        String continueSearch="";

        do {
            System.out.print("\nNhập tên sản phẩm cần tìm: ");
            String searchName = scanner.nextLine().trim().toLowerCase();

            boolean found = false;
            System.out.printf("%-10s %-20s %-10s %-10s %-15s %-10s %-15s %-15s%n",
                    "Product ID", "Name", "Price", "Total",
                    "Manufacturer", "RAM (GB)", "Base Total", "Final Total");
            System.out.println("-----------------------------------------------------------------------------------------------       -----------");

            for (Mobile mobile : mobiles) {
                String productName = mobile.getProductName().toLowerCase();

                if (productName.contains(searchName)) {
                    System.out.printf("%-10s %-20s %-10.2f %-10d %-15s %-10d %-15.2f %-15.2f%n",
                            mobile.getProductId(), mobile.getProductName(),
                            mobile.getProductPrice(), mobile.getProductTotal(),
                            mobile.getMobileManufacturer(), mobile.getMobileRam(),
                            mobile.getProductPrice() * mobile.getProductTotal(),
                            mobile.getTotalPrice());
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Không tìm thấy sản phẩm nào với tên: " + searchName);
            }

            boolean validInput = false;
            while (!validInput) {
                System.out.print("\nBạn có muốn tiếp tục tìm kiếm? (y/n): ");
                continueSearch = scanner.nextLine().trim().toLowerCase();

                if (continueSearch.equals("y") || continueSearch.equals("n")) {
                    validInput = true;
                } else {
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại!");
                }
            }

        } while (continueSearch.equalsIgnoreCase("y"));

        System.out.println("Cảm ơn bạn đã Xem!");
    }
}
