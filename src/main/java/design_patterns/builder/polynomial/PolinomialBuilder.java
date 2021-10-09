package design_patterns.builder.polynomial;

public class PolinomialBuilder {
  private String monomialDegree1;
  private String monomialDegree2;
  private String monomialDegree3;
  private String monomialDegree4;
  private String monomialDegree5;
  private String monomialDegree6;
  private String monomialDegree7;
  private String monomialDegree8;
  private String monomialDegree9;
  private String monomialDegree10;

  public PolinomialBuilder setMonomialDegree1(String monomial) {
    this.monomialDegree1 = monomial;
    return this;
  }

  public PolinomialBuilder setMonomialDegree2(String monomial) {
    this.monomialDegree2 = monomial;
    return this;
  }

  public PolinomialBuilder setMonomialDegree3(String monomial) {
    this.monomialDegree3 = monomial;
    return this;
  }

  public PolinomialBuilder setMonomialDegree4(String monomial) {
    this.monomialDegree4 = monomial;
    return this;
  }

  public PolinomialBuilder setMonomialDegree5(String monomial) {
    this.monomialDegree5 = monomial;
    return this;
  }

  public PolinomialBuilder setMonomialDegree6(String monomial) {
    this.monomialDegree6 = monomial;
    return this;
  }

  public PolinomialBuilder setMonomialDegree7(String monomial) {
    this.monomialDegree7 = monomial;
    return this;
  }

  public PolinomialBuilder setMonomialDegree8(String monomial) {
    this.monomialDegree8 = monomial;
    return this;
  }

  public PolinomialBuilder setMonomialDegree9(String monomial) {
    this.monomialDegree9 = monomial;
    return this;
  }

  public PolinomialBuilder setMonomialDegree10(String monomial) {
    this.monomialDegree10 = monomial;
    return this;
  }

  public Polynomial builder() {
    return new Polynomial(
        monomialDegree1,
        monomialDegree2,
        monomialDegree3,
        monomialDegree4,
        monomialDegree5,
        monomialDegree6,
        monomialDegree7,
        monomialDegree8,
        monomialDegree9,
        monomialDegree10);
  }
}
