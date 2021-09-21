package design_patterns.factory.polygon;

public interface Polygon {
  String getName();
  Integer getSides();

  default Integer getDiagonals() {
    return (this.getSides() * (this.getSides() -  3)) / 2;
  };
}
