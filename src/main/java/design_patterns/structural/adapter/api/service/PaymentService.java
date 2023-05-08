package design_patterns.structural.adapter.api.service;

import design_patterns.structural.adapter.api.repository.PaymentInterface;
import design_patterns.structural.adapter.api.repository.PaymentRepository;
import design_patterns.structural.adapter.api.repository.bb.BBRepository;
import design_patterns.structural.adapter.api.repository.itau.ItauRepository;

public class PaymentService {
  private final BBRepository bbRepository = new BBRepository();
  private final ItauRepository itauRepository = new ItauRepository();
  private final PaymentRepository repository = new PaymentRepository();

  public void create(PaymentInterface payment) {
    processBusinessRules(payment);
    repository.create(payment);
  }

  public void create(PaymentInterface payment, BankType bankType) {
    processBusinessRules(payment);

    switch (bankType) {
      case BB -> bbRepository.create(payment.adaptToBB());
      case ITAU -> itauRepository.create(payment.adaptToItau());
      default -> repository.create(payment);
    }
  }

  private void processBusinessRules(PaymentInterface payment) {
    if (payment == null) {
      throw new RuntimeException("Payment is null");
    }

    if (payment.account() == null || payment.account().isEmpty()) {
      throw new RuntimeException("Account is null or empty");
    }

    if (payment.agency() == null || payment.agency().isEmpty()) {
      throw new RuntimeException("Agency is null or empty");
    }

    if (payment.password() == null || payment.password().isEmpty()) {
      throw new RuntimeException("Password is null or empty");
    }

    if (payment.value() == null || !(Float.parseFloat(payment.value()) > 0)) {
      throw new RuntimeException("Value is not greater than zero");
    }
  }
}
