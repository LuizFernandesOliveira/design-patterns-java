package design_patterns.structural.adapter.api.repository;

import design_patterns.structural.adapter.api.repository.bb.BBInterface;
import design_patterns.structural.adapter.api.repository.itau.ItauInterface;


public record PaymentInterface(
    String account,
    String agency,
    String password,
    String value
) {

  public BBInterface adaptToBB() {
    return new BBInterface(
        account,
        agency,
        password,
        value
    );
  }

  public ItauInterface adaptToItau() {
    return new ItauInterface(
        account,
        agency,
        password,
        Float.parseFloat(value)
    );
  }
}
