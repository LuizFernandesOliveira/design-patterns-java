package design_patterns.creational.abstractfactory.gui;

import design_patterns.creational.abstractfactory.gui.buttons.Button;
import design_patterns.creational.abstractfactory.gui.checkboxes.Checkbox;

public interface GUI {
  Button createButton();
  Checkbox createCheckBox();
}
