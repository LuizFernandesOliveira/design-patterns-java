package design_patterns.factory.polygon.implementations;

import design_patterns.factory.polygon.Polygon;

public class Square implements Polygon {
  @Override
  public String getName() {
    return "Square";
  }

  @Override
  public Integer getSides() {
    return 4;
  }
}
