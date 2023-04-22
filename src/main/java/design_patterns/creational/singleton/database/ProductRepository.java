package design_patterns.creational.singleton.database;

public class ProductRepository {
  private static ProductRepository INSTANCE;
  private Long currentId = 0L;

  public static ProductRepository create() {
    return new ProductRepository();
  }

  public static ProductRepository getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new ProductRepository();
    }

    return INSTANCE;
  }

  public Product save(Product product) {
    product.setId(++currentId);
    return product;
  }
}
