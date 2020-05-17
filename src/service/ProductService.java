package service;

import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProduct();
    void saveProduct(Product product);
    Product findProductById(int id);
    void editProduct(int id, Product product);
    void removeProduct(int id);

}
