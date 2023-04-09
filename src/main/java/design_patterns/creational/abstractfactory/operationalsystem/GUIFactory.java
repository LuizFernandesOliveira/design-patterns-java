package design_patterns.creational.abstractfactory.operationalsystem;

import design_patterns.creational.abstractfactory.operationalsystem.implementations.OSType;
import design_patterns.creational.abstractfactory.operationalsystem.implementations.button.ButtonFactory;
import design_patterns.creational.abstractfactory.operationalsystem.implementations.checkbox.CheckboxFactory;

public class GUIFactory {

  public static GUI create(GUIType guiType, OSType osType) {
    return switch (guiType) {
      case BUTTON -> ButtonFactory.create(osType);
      case CHECKBOX -> CheckboxFactory.create(osType);
    };
  }
}
