public class SpecificProduct extends Product {

    public SpecificProduct(String product_id, String product_name, double product_price, int product_total) {
        super(product_id, product_name, product_price, product_total);
    }

    @Override
    public double getTotalPrice() {
        return getProductPrice() * getProductTotal();
    }

}
