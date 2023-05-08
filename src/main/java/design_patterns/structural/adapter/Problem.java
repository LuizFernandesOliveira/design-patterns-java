package design_patterns.structural.adapter;

import design_patterns.structural.adapter.api.controller.PaymentController;
import design_patterns.structural.adapter.api.repository.PaymentInterface;

public class Problem {
  public static void main(String[] args) {
     final var paymentController = new PaymentController();

     final var payment = new PaymentInterface("123", "456", "789", "100.0");

     paymentController.create(payment);
  }
}
