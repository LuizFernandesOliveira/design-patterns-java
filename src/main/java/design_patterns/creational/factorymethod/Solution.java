package design_patterns.creational.factorymethod;

import design_patterns.creational.factorymethod.polygon.Polygon;
import design_patterns.creational.factorymethod.polygon.PolygonFactory;
import design_patterns.creational.factorymethod.polygon.PolygonType;

public class Solution {
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
    System.out.println("Figura: \n");
    polygon.drawPicture();
  }
}
