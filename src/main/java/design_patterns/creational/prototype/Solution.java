package design_patterns.creational.prototype;

import design_patterns.creational.prototype.product.Product;

import java.time.Instant;

public class Solution {
  public static void main(String[] args) {
    testUpdateProduct();
  }

  static void testUpdateProduct() {
    var product = new Product("Product 1", 100, Instant.now());

    var updatedProduct = updateProduct(product.clone());

    // validar se a data de atualização anterior é antes da data de atualização atual
    if (product.updatedAt.isBefore(updatedProduct.updatedAt)) {
      System.out.println("PASS");
    } else {
      System.out.println("FAILURE");
    }
  }

  static Product updateProduct(Product product) {
    product.updatedAt = Instant.now();
    return product;
  }

  //
}
