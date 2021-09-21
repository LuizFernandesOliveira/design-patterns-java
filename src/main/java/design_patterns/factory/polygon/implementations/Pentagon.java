package design_patterns.factory.polygon.implementations;

import design_patterns.factory.polygon.Polygon;

public class Pentagon implements Polygon {
  @Override
  public String getName() {
    return "Pentagon";
  }

  @Override
  public Integer getSides() {
    return 5;
  }

  @Override
  public void drawPicture() {
    System.out.println("  *  ");
    System.out.println("*   *");
    System.out.println(" * * ");
  }
}
