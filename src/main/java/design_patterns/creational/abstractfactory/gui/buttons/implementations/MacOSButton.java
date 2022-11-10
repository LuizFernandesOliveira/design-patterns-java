package design_patterns.creational.abstractfactory.gui.buttons.implementations;

import design_patterns.creational.abstractfactory.gui.buttons.Button;

public class MacOSButton implements Button {

  @Override
  public void paint() {
    System.out.println("Você está criando um MacOSButton.");
  }
}
