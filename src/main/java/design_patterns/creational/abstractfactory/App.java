package design_patterns.creational.abstractfactory;

import design_patterns.creational.abstractfactory.gui.GUIType;

public class App {
  public static void main(String[] args) {
    var os = System.getProperty("os.name").toUpperCase();
    var gui = GUIType.valueOf(os);
    paintGUI(gui);
  }

  private static void paintGUI(GUIType guiType) {
    var gui = guiType.factory;
    var button = gui.createButton();
    var checkbox = gui.createCheckBox();

    button.paint();
    checkbox.paint();
  }
}
