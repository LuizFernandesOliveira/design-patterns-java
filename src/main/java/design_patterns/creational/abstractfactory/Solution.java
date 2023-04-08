package design_patterns.creational.abstractfactory;

import design_patterns.creational.abstractfactory.operationalsystem.GUI;
import design_patterns.creational.abstractfactory.operationalsystem.GUIFactory;
import design_patterns.creational.abstractfactory.operationalsystem.GUIType;
import design_patterns.creational.abstractfactory.operationalsystem.implementations.OSType;

public class Solution {

  public static void main(String[] args) {
    final var gui = getGUI(GUIType.BUTTON);

    gui.props();
  }

  public static GUI getGUI(GUIType guiType) {
    final var osName = System.getProperty("os.name").toUpperCase();
    final var osType = OSType.valueOf(osName);
    return getGUI(guiType, osType);
  }

  public static GUI getGUI(GUIType guiType, OSType osType) {
    return GUIFactory.create(guiType, osType);
  }
}
