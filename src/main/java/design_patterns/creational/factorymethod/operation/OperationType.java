package design_patterns.creational.factorymethod.operation;

import design_patterns.creational.factorymethod.operation.implementations.Divide;
import design_patterns.creational.factorymethod.operation.implementations.Multiply;
import design_patterns.creational.factorymethod.operation.implementations.Subtract;
import design_patterns.creational.factorymethod.operation.implementations.Sum;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum OperationType {
  SUM(new Sum()),
  SUBTRACT(new Subtract()),
  MULTIPLY(new Multiply()),
  DIVIDE(new Divide());

  public final Operation factory;
}
