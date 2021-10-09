package design_patterns;

import design_patterns.builder.polynomial.Polynomial;

public class Main {
  public static void main(String[] args) {
    Polynomial polynomial = new Polynomial("2x^1", "5x^2", "1x^3", "3x^4", "4x^5", "7x^6", "2x^7", "2x^8", "6x^9", "8x^10");

    System.out.println(polynomial.toString());
  }
}
