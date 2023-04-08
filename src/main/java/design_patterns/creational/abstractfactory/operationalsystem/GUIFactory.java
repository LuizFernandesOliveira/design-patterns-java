package design_patterns.creational.abstractfactory.operationalsystem;

import design_patterns.creational.abstractfactory.operationalsystem.implementations.OSType;
import design_patterns.creational.abstractfactory.operationalsystem.implementations.button.ButtonFactory;
import design_patterns.creational.abstractfactory.operationalsystem.implementations.checkbox.CheckboxFactory;

public class GUIFactory {

  public static GUI create(GUIType guiType, OSType osType) {
    switch (guiType) {
      case BUTTON:
        return ButtonFactory.create(osType);
      case CHECKBOX:
        return CheckboxFactory.create(osType);
      default:
        throw new IllegalArgumentException("Unknown GUI type");
    }
  }
}
