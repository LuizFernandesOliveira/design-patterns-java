package design_patterns.structural.adapter.api.repository.itau;

public class ItauRepository {
  public void create(ItauInterface itau) {
    System.out.println("ITAU Pagamento");
    System.out.println("Conta: " + itau.account());
    System.out.println("Agencia: " + itau.agency());
    System.out.println("Senha: " + itau.password());
    System.out.println("Valor: " + itau.value());
  }
}
