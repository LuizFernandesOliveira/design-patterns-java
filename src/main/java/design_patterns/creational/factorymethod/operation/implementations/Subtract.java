package design_patterns.creational.factorymethod.operation.implementations;

import design_patterns.creational.factorymethod.operation.Operation;

import java.math.BigDecimal;
import java.util.List;

public class Subtract implements Operation {
  @Override
  public BigDecimal apply(List<BigDecimal> numbers) {
    return numbers.get(0).subtract(numbers.get(1));
  }
}
