package design_patterns.creational.abstractfactory.operationalsystem.implementations.checkbox.implementations;

import design_patterns.creational.abstractfactory.operationalsystem.implementations.checkbox.Checkbox;

public class LinuxCheckbox implements Checkbox {

  @Override
  public void props() {
    System.out.println("Linux checkbox props");
  }
}
