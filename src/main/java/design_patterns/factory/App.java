package design_patterns.factory;

import design_patterns.factory.polygon.Polygon;
import design_patterns.factory.polygon.PolygonFactory;
import design_patterns.factory.polygon.PolygonType;

public class App {
  public static void main(String[] args) {
    Polygon polygon = PolygonFactory.create(PolygonType.TRIANGLE);

    System.out.println(polygon.getDiagonals());
  }
}
