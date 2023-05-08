package design_patterns.structural.adapter.api.repository;

public class PaymentRepository {

  public void create(PaymentInterface payment) {
    System.out.println("Interno Pagamento");
    System.out.println("Conta: " + payment.account());
    System.out.println("Agencia: " + payment.agency());
    System.out.println("Senha: " + payment.password());
    System.out.println("Valor: " + payment.value());
  }
}
