package design_patterns.builder.polynomial;

public class Polynomial {
  private final String monomialDegree1;
  private final String monomialDegree2;
  private final String monomialDegree3;
  private final String monomialDegree4;
  private final String monomialDegree5;
  private final String monomialDegree6;
  private final String monomialDegree7;
  private final String monomialDegree8;
  private final String monomialDegree9;
  private final String monomialDegree10;

  public Polynomial(
      String monomialDegree1,
      String monomialDegree2,
      String monomialDegree3,
      String monomialDegree4,
      String monomialDegree5,
      String monomialDegree6,
      String monomialDegree7,
      String monomialDegree8,
      String monomialDegree9,
      String monomialDegree10) {
    this.monomialDegree1 = monomialDegree1;
    this.monomialDegree2 = monomialDegree2;
    this.monomialDegree3 = monomialDegree3;
    this.monomialDegree4 = monomialDegree4;
    this.monomialDegree5 = monomialDegree5;
    this.monomialDegree6 = monomialDegree6;
    this.monomialDegree7 = monomialDegree7;
    this.monomialDegree8 = monomialDegree8;
    this.monomialDegree9 = monomialDegree9;
    this.monomialDegree10 = monomialDegree10;
  }

  @Override
  public String toString() {
    var print1 = monomialDegree1 == null ? "" : monomialDegree1;
    var print2 = monomialDegree2 == null ? "" : " + " + monomialDegree2;
    var print3 = monomialDegree3 == null ? "" : " + " + monomialDegree3;
    var print4 = monomialDegree4 == null ? "" : " + " + monomialDegree4;
    var print5 = monomialDegree5 == null ? "" : " + " + monomialDegree5;
    var print6 = monomialDegree6 == null ? "" : " + " + monomialDegree6;
    var print7 = monomialDegree7 == null ? "" : " + " + monomialDegree7;
    var print8 = monomialDegree8 == null ? "" : " + " + monomialDegree8;
    var print9 = monomialDegree9 == null ? "" : " + " + monomialDegree9;
    var print10 = monomialDegree10 == null ? "" : " + " + monomialDegree10;

    return print1 + print2 + print3 + print4 + print5 + print6 + print7 + print8 + print9 + print10;
  }
}
