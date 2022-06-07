import java.util.ArrayList;

public class ProductService {
    String productName;
    double price = 0.00;
    Product product_object;

    // Creating an array list of product type
    ArrayList<Product> productList = new ArrayList<>();

    // Take product code as parameter and return the name of the product
    // from the list of products present in ProductRepository
    // If no product is found for the given product code, return null
    public String findNameByCode(int productCode) {
        for(Product p : ProductRepository.productList){
            if(productCode == p.getProductCode()){
                productName = p.getName();
                break;
            }
            else{
                productName = null;
            }
        }
        return productName;
    }

    // Take product category as a parameter and return the product object
    // having the maximum price in the category provided
    // If no product is found for the given category, return null
    public Product findMaxPriceProduct(String category) {
        boolean flag = false;
        for(Product p : ProductRepository.productList) {
            if (category.equals(p.getCategory())) {
                if (price < p.getPrice()) {
                    price = p.getPrice();
                    product_object = p;

                    flag = true;
                }
            }
        }

        if(flag)
            return product_object;
        else
            return null;
    }

    // Take product category as parameter and return the array of products
    // in the category provided
    // If no product are found for the given category, return null
    public ArrayList<Product> getProductsByCategory(String category) {
        for(Product p : ProductRepository.productList){
            if(category.equals(p.getCategory())){
                productList.add(p);
            }
            else{
                product_object = null;
            }
        }
        return productList;
    }
}