package design_patterns.structural.adapter.api.repository.bb;

public class BBRepository {
  public void create(BBInterface bb) {
    System.out.println("BB Pagamento");
    System.out.println("Conta: " + bb.conta());
    System.out.println("Agencia: " + bb.agencia());
    System.out.println("Senha: " + bb.senha());
    System.out.println("Valor: " + bb.valor());
  }
}
