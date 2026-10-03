package entities;

import java.util.Objects;

public class Dolar extends Moeda{
    // Taxa de câmbio fixa utilizada para a conversão
    private final double VALOR_CAMBIO = 5.15; //Valor baseado no dia 28/09/2026

    public Dolar(Double valor) {
        super(valor);
    }

    @Override
    public Double getValor() {
        return super.getValor();
    }

    @Override
    public void setValor(Double valor) {
        super.setValor(valor);
    }

    @Override
    public void info() {
        System.out.printf("Dolar: %.2f%n", getValor() );
    }

    @Override
    public Double converter() {
        return getValor() * VALOR_CAMBIO;
    }

    // Garante que a comparação e remoção considerem tanto o tipo quanto o câmbio/valor
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dolar dolar = (Dolar) o;
        return Double.compare(VALOR_CAMBIO, dolar.VALOR_CAMBIO) == 0;
    }

}
