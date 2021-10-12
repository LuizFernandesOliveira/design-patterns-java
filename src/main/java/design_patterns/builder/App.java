package design_patterns.builder;

import design_patterns.builder.polynomial.PolynomialBuilder;
import design_patterns.builder.polynomial.Polynomial;

public class App {
  public static void main(String[] args) {
    Polynomial polynomial = new PolynomialBuilder()
        .setMonomialDegree1("10x^1")
        .setMonomialDegree3("4x^3")
        .builder();

    Polynomial polynomial1 = Polynomial.builder()
            .monomialDegree1("10x^1")
            .monomialDegree7("2x^7")
            .monomialDegree2("5x^2")
            .build();

    System.out.println(polynomial1);
  }
}
