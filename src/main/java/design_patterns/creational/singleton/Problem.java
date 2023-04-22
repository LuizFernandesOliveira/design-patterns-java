package design_patterns.creational.singleton;

import design_patterns.creational.singleton.database.Product;
import design_patterns.creational.singleton.database.ProductRepository;

public class Problem {
  public static void main(String[] args) {
    saveProduct(Product.builder().name("Produto 1").build());
    saveProduct(Product.builder().name("Produto 2").build());
  }

  public static void saveProduct(Product product) {
    var productRepository = ProductRepository.create();

    productRepository.save(product);

    System.out.println("Product saved: " + product);
  }
}
