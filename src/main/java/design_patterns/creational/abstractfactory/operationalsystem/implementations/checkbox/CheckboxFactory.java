package design_patterns.creational.abstractfactory.operationalsystem.implementations.checkbox;

import design_patterns.creational.abstractfactory.operationalsystem.implementations.OSType;
import design_patterns.creational.abstractfactory.operationalsystem.implementations.checkbox.implementations.LinuxCheckbox;
import design_patterns.creational.abstractfactory.operationalsystem.implementations.checkbox.implementations.WindowsCheckbox;

public class CheckboxFactory {

  public static Checkbox create(OSType type) {
    return switch (type) {
      case LINUX -> new LinuxCheckbox();
      case WINDOWS -> new WindowsCheckbox();
    };
  }
}
