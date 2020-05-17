package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl extends ProductService{
    private static Map<Integer, Product> productList;

    static {
        productList = new HashMap<>();
        productList.put(1, new Product(1,"Samsung Galaxy Note 8", "Samsung", 13000000, "Available"));
        productList.put(2, new Product(2,"Samsung Galaxy Note 9", "Samsung", 15000000, "Over"));
        productList.put(3, new Product(3,"Samsung Galaxy Note 10", "Samsung", 20000000, "Available"));
        productList.put(4, new Product(4,"Iphone 8 Plus", "Apple", 14500000, "Over"));
        productList.put(5, new Product(5,"Iphone XSMax", "Apple", 23000000, "Available"));
        productList.put(6, new Product(6,"Oppo L8", "Oppo", 9000000, "Over"));
    }
    @Override
    public List<Product> findAllProduct() {
        return new ArrayList<>(productList.values());
    }

    @Override
    public void saveProduct(Product product) {
        productList.put(product.getId(), product);
    }

    @Override
    public Product findProductById(int id) {
        return productList.get(id);
    }

    @Override
    public void editProduct(int id, Product product) {
        productList.put(id, product);
    }

    @Override
    public void removeProduct(int id) {
        productList.remove(id);
    }
}
