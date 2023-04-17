package design_patterns.creational.prototype.product;

import java.time.Instant;

public class Product implements Prototype<Product> {
  public String name;
  public int value;
  public Instant updatedAt;

  public Product(String name, int value, Instant updatedAt) {
    this.name = name;
    this.value = value;
    this.updatedAt = updatedAt;
  }

  @Override
  public Product clone() {
    return new Product(this.name, this.value, this.updatedAt);
  }

  @Override
  public String toString() {
    return "Product{" +
        "name='" + name + '\'' +
        ", value=" + value +
        ", updatedAt=" + updatedAt +
        '}';
  }
}
