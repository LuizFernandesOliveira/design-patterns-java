package design_patterns.factory.polygon;

import design_patterns.factory.polygon.implementations.Pentagon;
import design_patterns.factory.polygon.implementations.Square;
import design_patterns.factory.polygon.implementations.Triangle;

public class PolygonFactory {

  public static Polygon create(PolygonType polygonType) {

    switch (polygonType) {
      case SQUARE:
        return new Square();
      case PENTAGON:
        return new Pentagon();
      default:
        return new Triangle();
    }

  }

}
