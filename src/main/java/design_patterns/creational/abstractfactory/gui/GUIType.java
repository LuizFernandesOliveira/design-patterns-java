package design_patterns.creational.abstractfactory.gui;

import design_patterns.creational.abstractfactory.gui.implementations.Linux;
import design_patterns.creational.abstractfactory.gui.implementations.MacOS;
import design_patterns.creational.abstractfactory.gui.implementations.Windows;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum GUIType {
  MAC_OS(new MacOS()),
  WINDOWS(new Windows()),
  LINUX(new Linux());

  public final GUI factory;
}
