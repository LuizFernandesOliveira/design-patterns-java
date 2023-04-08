package design_patterns.creational.abstractfactory;

import design_patterns.creational.abstractfactory.operationalsystem.implementations.button.implementation.WindowsButton;

public class Problem {

  public static void main(String[] args) {
    WindowsButton button = new WindowsButton();

    button.props();
  }
}
