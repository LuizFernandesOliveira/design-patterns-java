package design_patterns.factorymethod;

import design_patterns.factorymethod.operation.OperationType;

import java.math.BigDecimal;
import java.util.List;

public class App {
  public static void main(String[] args) {
    var numberToSum = List.of(BigDecimal.valueOf(10), BigDecimal.valueOf(20));
    var sum = calculator(OperationType.SUM, numberToSum);
    System.out.println(sum);

    var numberToMultiply = List.of(BigDecimal.valueOf(10), BigDecimal.valueOf(10));
    var multiply = calculator(OperationType.MULTIPLY, numberToMultiply);
    System.out.println(multiply);
  }

  private static BigDecimal calculator(OperationType operationType, List<BigDecimal> numbers) {
    return operationType.factory.apply(numbers);
  }
}
