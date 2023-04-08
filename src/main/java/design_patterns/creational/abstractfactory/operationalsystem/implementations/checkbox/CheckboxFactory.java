package design_patterns.creational.abstractfactory.operationalsystem.implementations.checkbox;

import design_patterns.creational.abstractfactory.operationalsystem.implementations.OSType;
import design_patterns.creational.abstractfactory.operationalsystem.implementations.checkbox.implementations.LinuxCheckbox;
import design_patterns.creational.abstractfactory.operationalsystem.implementations.checkbox.implementations.WindowsCheckbox;

public class CheckboxFactory {

  public static Checkbox create(OSType type) {
    switch (type) {
      case LINUX:
        return new LinuxCheckbox();
      case WINDOWS:
        return new WindowsCheckbox();
      default:
        throw new IllegalArgumentException("Invalid GUI type");
    }
  }
}
