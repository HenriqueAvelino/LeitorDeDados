public class ImportedProduct extends Product {
    private Double customsFee;


    public ImportedProduct(String name, Double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return price + customsFee;
    }

    @Override
    public String priceTag() {
        return String.format("%s $ %.2f (Taxa alfandegaria: $ %.2f)", name, totalPrice(), customsFee);
    }

}
