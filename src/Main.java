import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        // Leitura dos dados do teclado
        Scanner sc = new Scanner(System.in);

        // formatação da data
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.US);

        // lista de produtos
        List<Product> products = new ArrayList<>();

        System.out.print("Quantidade de produtos que deseja cadastrar: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Produto #" + (i + 1) + " data:");
            System.out.print("\n[1] NORMAL, USADO or IMPORTADO");
            System.out.println("\n1 - Normal");
            System.out.println("\n2 - Usado");
            System.out.println("\n3 - Importado");

            char type = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Nome do produto: ");
            String name = sc.nextLine();

            System.out.print("PREÇO: ");
            double price = sc.nextDouble();

            // adicionando produtos na lista

            if (type == '3') {
                System.out.print("Taxa de alfândega: ");
                double customsFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));

            } else if (type == '2') {
                System.out.print("Data de manufatura: ");
                Date manufactureDate = sdf.parse(sc.next());
                products.add(new UsedProduct(name, price, manufactureDate));

            } else {
                products.add(new Product(name, price));
            }
        }

        System.out.println();

        // listagem dos produtos
        System.out.println("Produto | Preço:");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
