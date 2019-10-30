package net.swedbank.gyk.collections.productset;

import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Products {

    Set<Product> products;

    public Products() {
        products = new HashSet<>();
    }

    public static void main(String[] args) throws IOException, ParseException {

        List<Reader.ProductItem> productList = Reader.readProducts("products.json");

        Products products = new Products();

        for(Reader.ProductItem item: productList) {
            products.addProduct(item.getId(), item.getName(), item.getSalesDate());
        }

        System.out.printf("We have sold %d unique items\n", products.numberOfProducts());

        products.printAll();

    }

    //implement this
    private void addProduct(String id, String name, LocalDateTime salesDate) {
        Product product = new Product(id, name, salesDate);
        if(products.contains(product)) {
            products.remove(product);
        }
        products.add(product);
    }


    //implement this
    public int numberOfProducts() {
        return products.size();
    }

    public void printAll() {
        for(Product product: products ) {
            // implement printing here
            System.out.println(product);
        }
    }


}
