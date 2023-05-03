package design_patterns.structural.adapter.api.repository.bb;

public record BBInterface(
    String conta,
    String agencia,
    String senha,
    String valor
) {
}
