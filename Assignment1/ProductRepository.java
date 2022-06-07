import java.util.ArrayList;
import java.util.Arrays;

public class ProductRepository {

    static ArrayList<Product> productList = new ArrayList<>(Arrays.asList(
            new Product(101, "Shirt",1200.0,"Fashion"),
            new Product(102, "Trouser", 700.0, "Fashion"),
            new Product(103, "Refrigerator", 25000.0, "Electronics"),
            new Product(104, "Television", 22000.0, "Electronics"),
            new Product(105, "Chandler", 5200.0, "Home and Decor"),
            new Product(106, "Curtains", 2200.0, "Home and Decor")
    ));
}
