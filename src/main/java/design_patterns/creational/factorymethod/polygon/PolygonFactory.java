package design_patterns.creational.factorymethod.polygon;

import design_patterns.creational.factorymethod.polygon.implementations.*;

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
