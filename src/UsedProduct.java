import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class UsedProduct extends Product {
    private Date manufactureDate;

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override

    public String priceTag() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
        return String.format("%s (#Produto usado) $ %.2f (Data da manufatura: %s)", name, price, sdf.format(manufactureDate));
    }
}