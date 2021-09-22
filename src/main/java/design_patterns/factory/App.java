package design_patterns.factory;

import design_patterns.factory.polygon.Polygon;
import design_patterns.factory.polygon.PolygonFactory;
import design_patterns.factory.polygon.PolygonType;

public class App {
  public static void main(String[] args) {
    Polygon polygon = PolygonFactory.create(PolygonType.HEXAGON);

    System.out.println("-----------------------------------------------");
    System.out.println("---------- PROPRIEDADES DO POLÍGONO -----------");
    System.out.println("-----------------------------------------------");
    System.out.println("Nome:                    | " + polygon.getName());
    System.out.println("-----------------------------------------------");
    System.out.println("Quantidade de Lados:     | " + polygon.getSides());
    System.out.println("-----------------------------------------------");
    System.out.println("Quantidade de diagonais: | " + polygon.getDiagonals());
    System.out.println("-----------------------------------------------");
    System.out.println("Figura:");polygon.drawPicture();
  }
}
