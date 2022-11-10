package design_patterns.creational.factorymethod.operation;

import java.math.BigDecimal;
import java.util.List;

public interface Operation {

  BigDecimal apply(List<BigDecimal> numbers);
}
