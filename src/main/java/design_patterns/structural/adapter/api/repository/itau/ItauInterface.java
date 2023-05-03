package design_patterns.structural.adapter.api.repository.itau;

import java.math.BigDecimal;

public record ItauInterface(
    String account,
    String agency,
    String password,
    Float value
) {
}
