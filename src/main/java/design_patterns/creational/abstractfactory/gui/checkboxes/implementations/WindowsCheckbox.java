package design_patterns.creational.abstractfactory.gui.checkboxes.implementations;

import design_patterns.creational.abstractfactory.gui.checkboxes.Checkbox;

public class WindowsCheckbox implements Checkbox {

  @Override
  public void paint() {
    System.out.println("Você está criando um WindowsCheckbox.");
  }
}
