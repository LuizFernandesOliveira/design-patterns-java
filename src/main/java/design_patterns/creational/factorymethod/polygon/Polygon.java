package design_patterns.creational.factorymethod.polygon;

public interface Polygon {
  String getName();
  Integer getSides();
  void drawPicture();

  default Integer getDiagonals() {
    return (this.getSides() * (this.getSides() -  3)) / 2;
  };
}
