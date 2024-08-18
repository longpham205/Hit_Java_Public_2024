public class Mobile extends Product {

    private String mobile_manufacturer;
    private int mobile_ram;

    public Mobile() {
        super();
    }

    public Mobile(String product_id, String product_name, double product_price, int product_total,
                  String mobile_manufacturer, int mobile_ram) {
        super(product_id, product_name, product_price, product_total);
        this.mobile_manufacturer = mobile_manufacturer;
        this.mobile_ram = mobile_ram;
    }

    public String getMobileManufacturer() {
        return mobile_manufacturer;
    }

    public void setMobileManufacturer(String mobile_manufacturer) {
        this.mobile_manufacturer = mobile_manufacturer;
    }

    public int getMobileRam() {
        return mobile_ram;
    }

    public void setMobileRam(int mobile_ram) {
        this.mobile_ram = mobile_ram;
    }

    @Override
    public double getTotalPrice() {
        double baseTotalPrice = getProductPrice() * getProductTotal();
        return baseTotalPrice * 1.2;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Manufacturer: " + mobile_manufacturer +
                ", RAM: " + mobile_ram + "GB";
    }
}


