package design_patterns.factory.polygon.implementations;

import design_patterns.factory.polygon.Polygon;

public class Hexagon implements Polygon {
  @Override
  public String getName() {
    return "Hexagon";
  }

  @Override
  public Integer getSides() {
    return 6;
  }

  @Override
  public void drawPicture() {
    System.out.println("<>");
  }
}
