package design_patterns.creational.abstractfactory.gui.buttons;

import design_patterns.creational.abstractfactory.gui.buttons.implementations.LinuxButton;
import design_patterns.creational.abstractfactory.gui.buttons.implementations.MacOSButton;
import design_patterns.creational.abstractfactory.gui.buttons.implementations.WindowsButton;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ButtonType {
  MAC_OS(new MacOSButton()),
  WINDOWS(new WindowsButton()),
  LINUX(new LinuxButton());

  public final Button factory;
}
