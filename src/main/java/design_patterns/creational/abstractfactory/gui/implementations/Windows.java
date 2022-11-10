package design_patterns.creational.abstractfactory.gui.implementations;

import design_patterns.creational.abstractfactory.gui.GUI;
import design_patterns.creational.abstractfactory.gui.buttons.Button;
import design_patterns.creational.abstractfactory.gui.buttons.ButtonType;
import design_patterns.creational.abstractfactory.gui.checkboxes.Checkbox;
import design_patterns.creational.abstractfactory.gui.checkboxes.CheckboxType;

public class Windows implements GUI {
  @Override
  public Button createButton() {
    return ButtonType.WINDOWS.factory;
  }

  @Override
  public Checkbox createCheckBox() {
    return CheckboxType.WINDOWS.factory;
  }
}
