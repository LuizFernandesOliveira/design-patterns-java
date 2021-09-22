package design_patterns.factory.polygon;

import design_patterns.factory.polygon.implementations.Hexagon;
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
      case HEXAGON:
        return new Hexagon();
      default:
        return new Triangle();
    }

  }

}
