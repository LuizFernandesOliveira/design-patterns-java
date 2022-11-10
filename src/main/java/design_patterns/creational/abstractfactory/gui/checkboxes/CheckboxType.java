package design_patterns.creational.abstractfactory.gui.checkboxes;

import design_patterns.creational.abstractfactory.gui.checkboxes.implementations.LinuxCheckbox;
import design_patterns.creational.abstractfactory.gui.checkboxes.implementations.MacOSCheckbox;
import design_patterns.creational.abstractfactory.gui.checkboxes.implementations.WindowsCheckbox;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum CheckboxType {
  MAC_OS(new MacOSCheckbox()),
  WINDOWS(new WindowsCheckbox()),
  LINUX(new LinuxCheckbox());

  public final Checkbox factory;
}
