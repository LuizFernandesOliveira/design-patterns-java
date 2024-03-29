package design_patterns.creational.builder;

import design_patterns.creational.builder.polynomial.Polynomial;

public class Problem {
  public static void main(String[] args) {
    Polynomial polynomial = new Polynomial("5x^2", "2x^1", "1x^3", "3x^4", "4x^5", "7x^6", "2x^7", "2x^8", "6x^9", "8x^10");

    System.out.println(polynomial);
  }
}
