package design_patterns.builder;

import design_patterns.builder.polynomial.PolinomialBuilder;
import design_patterns.builder.polynomial.Polynomial;

public class App {
  public static void main(String[] args) {
    Polynomial polynomial = new PolinomialBuilder()
        .setMonomialDegree1("10x^1")
        .setMonomialDegree3("4x^3")
        .builder();

    System.out.println(polynomial);
  }
}
