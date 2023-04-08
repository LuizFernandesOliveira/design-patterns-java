package design_patterns.creational.abstractfactory.operationalsystem.implementations.button.implementation;

import design_patterns.creational.abstractfactory.operationalsystem.implementations.button.Button;

public class LinuxButton implements Button {

  @Override
  public void props() {
    System.out.println("Linux button props");
  }
}
