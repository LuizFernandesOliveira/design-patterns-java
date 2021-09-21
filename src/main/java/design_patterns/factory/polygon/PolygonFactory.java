package design_patterns.factory.polygon;

import design_patterns.factory.polygon.implementations.Square;
import design_patterns.factory.polygon.implementations.Triangle;

public class PolygonFactory {

  public static Polygon create(PolygonType polygonType) {

    switch (polygonType) {
      case SQUARE:
        return new Square();
      default:
        return new Triangle();
    }

  }

}
