package design_patterns;

import design_patterns.factory.polygon.implementations.Square;
import design_patterns.factory.polygon.implementations.Triangle;

public class Main {
  public static void main(String[] args) {
    Triangle triangle = new Triangle();
    System.out.println("Nome:                    | " + triangle.getName());
    System.out.println("Quantidade de Lados:     | " + triangle.getSides());
    System.out.println("Quantidade de diagonais: | " + triangle.getDiagonals());
    System.out.println("Figura:");triangle.drawPicture();

    Square square = new Square();
    System.out.println("Nome:                    | " + square.getName());
    System.out.println("Quantidade de Lados:     | " + square.getSides());
    System.out.println("Quantidade de diagonais: | " + square.getDiagonals());
    System.out.println("Figura:");square.drawPicture();

  }
}
