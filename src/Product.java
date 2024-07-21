public class Product {
    public String name;
    public Double price;


    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Retornando String de nome e preço formatado.
    public String priceTag() {
        return String.format("%s $ %.2f", name, price);
    }


}