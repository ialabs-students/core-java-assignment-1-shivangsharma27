import java.util.ArrayList;
import java.util.Iterator;

public class Product {
    // Data members of the class Product
    private int productCode;
    private String name;
    private double price;
    private String category;

    // Parameterised constructor
    public Product(int productCode, String name, double price, String category) {
        this.productCode = productCode;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Getters and Setters
    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static void main(String[] args) {

        // Creating the object of the product service!
        ProductService productService = new ProductService();

        // calling the method findNameByCode from Product service and pass the argument
        // product code of type integer and return the product name
        String prodName = productService.findNameByCode(103);
        System.out.println("Product Name: " + prodName);

        // calling the method findMaxPriceProduct from Product service and pass the
        // argument category of type string and returns product object
        Product product_obj = productService.findMaxPriceProduct("Home and Decor");
        System.out.println("Maximum price of the product in Home and Decor Category: " + product_obj.getPrice());

        // calling the method getProductsByCategory from Product service and pass the
        // argument category of type string and return the list of products
        ArrayList<Product> products = productService.getProductsByCategory("Fashion");
        if (products != null) {
            Iterator itr = products.iterator();
            while (itr.hasNext()) {
                Product product = (Product) itr.next();
                System.out.println("[ product code: " + product.getProductCode() + ", product name: "
                        + product.getName() + ", product price: Rs." + product.getPrice() + ", product catagory: "
                        + product.getCategory() + " ]");
            }
        }
    }
}