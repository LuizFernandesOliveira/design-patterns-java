package design_patterns.structural.adapter.api.controller;

import design_patterns.structural.adapter.api.service.BankType;
import design_patterns.structural.adapter.api.repository.PaymentInterface;
import design_patterns.structural.adapter.api.service.PaymentService;

public class PaymentController {
  private final PaymentService service = new PaymentService();

  public void create(PaymentInterface payment) {
    service.create(payment);
  }

  public void create(PaymentInterface payment, BankType bankType) {
    service.create(payment, bankType);
  }
}
