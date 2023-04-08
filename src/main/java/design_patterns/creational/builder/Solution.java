package design_patterns.creational.builder;

import design_patterns.creational.builder.polynomial.Polynomial;
import design_patterns.creational.builder.polynomial.PolynomialBuilder;

public class Solution {
  public static void main(String[] args) {
    Polynomial polynomial = new PolynomialBuilder()
        .setMonomialDegree1("10x^1")
        .setMonomialDegree3("4x^3")
        .builder();

    System.out.println(polynomial);
  }
}
