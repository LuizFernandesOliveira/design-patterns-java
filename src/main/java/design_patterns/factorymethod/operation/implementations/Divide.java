package design_patterns.factorymethod.operation.implementations;

import design_patterns.factorymethod.operation.Operation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Divide implements Operation {
  @Override
  public BigDecimal apply(List<BigDecimal> numbers) {
    return numbers.get(0).divide(numbers.get(1)).setScale(2, RoundingMode.HALF_EVEN);
  }
}
