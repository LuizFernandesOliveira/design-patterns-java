package design_patterns.creational.factorymethod.polygon;

import design_patterns.creational.factorymethod.polygon.implementations.*;

public class PolygonFactory {
  public static Polygon create(PolygonType polygonType) {
    return switch (polygonType) {
      case SQUARE -> new Square();
      case PENTAGON -> new Pentagon();
      case HEXAGON -> new Hexagon();
      default -> throw new IllegalArgumentException();
    };
  }
}
