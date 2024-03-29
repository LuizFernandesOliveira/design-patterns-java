package design_patterns.creational.factorymethod;


import design_patterns.creational.factorymethod.polygon.implementations.Square;
import design_patterns.creational.factorymethod.polygon.implementations.Triangle;

public class Problem {
  public static void main(String[] args) {
    Triangle triangle = new Triangle();
    System.out.println("-----------------------------------------------");
    System.out.println("---------- PROPRIEDADES DO POLÍGONO -----------");
    System.out.println("-----------------------------------------------");
    System.out.println("Nome:                    | " + triangle.getName());
    System.out.println("-----------------------------------------------");
    System.out.println("Quantidade de Lados:     | " + triangle.getSides());
    System.out.println("-----------------------------------------------");
    System.out.println("Quantidade de diagonais: | " + triangle.getDiagonals());
    System.out.println("-----------------------------------------------");
    triangle.drawPicture();

    Square square = new Square();
    System.out.println("-----------------------------------------------");
    System.out.println("---------- PROPRIEDADES DO POLÍGONO -----------");
    System.out.println("-----------------------------------------------");
    System.out.println("Nome:                    | " + square.getName());
    System.out.println("-----------------------------------------------");
    System.out.println("Quantidade de Lados:     | " + square.getSides());
    System.out.println("-----------------------------------------------");
    System.out.println("Quantidade de diagonais: | " + square.getDiagonals());
    System.out.println("-----------------------------------------------");
    square.drawPicture();
  }
}
