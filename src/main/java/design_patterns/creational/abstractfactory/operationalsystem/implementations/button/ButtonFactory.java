package design_patterns.creational.abstractfactory.operationalsystem.implementations.button;

import design_patterns.creational.abstractfactory.operationalsystem.implementations.OSType;
import design_patterns.creational.abstractfactory.operationalsystem.implementations.button.implementation.LinuxButton;
import design_patterns.creational.abstractfactory.operationalsystem.implementations.button.implementation.WindowsButton;

public class ButtonFactory {

  public static Button create(OSType type) {
    switch (type) {
      case WINDOWS:
        return new WindowsButton();
      case LINUX:
        return new LinuxButton();
      default:
        throw new IllegalArgumentException("Invalid GUI type");
    }
  }
}
