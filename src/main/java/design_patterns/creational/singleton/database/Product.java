package design_patterns.creational.singleton.database;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class Product {
  private Long id;
  private String name;
}
