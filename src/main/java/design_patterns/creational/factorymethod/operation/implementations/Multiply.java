package design_patterns.creational.factorymethod.operation.implementations;

import design_patterns.creational.factorymethod.operation.Operation;

import java.math.BigDecimal;
import java.util.List;

public class Multiply implements Operation {
  @Override
  public BigDecimal apply(List<BigDecimal> numbers) {
    return numbers.stream().reduce(BigDecimal.ONE, BigDecimal::multiply);
  }
}
