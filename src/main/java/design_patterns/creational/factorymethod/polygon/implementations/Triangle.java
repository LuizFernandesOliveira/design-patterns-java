package design_patterns.creational.factorymethod.polygon.implementations;

import design_patterns.creational.factorymethod.polygon.Polygon;

public class Triangle implements Polygon {
  @Override
  public String getName() {
    return "Triangle";
  }

  @Override
  public Integer getSides() {
    return 3;
  }

  @Override
  public void drawPicture() {
    System.out.println("  *  ");
    System.out.println(" * * ");
    System.out.println("* * *");
  }
}