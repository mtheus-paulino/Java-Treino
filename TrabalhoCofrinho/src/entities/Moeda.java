package entities;

import java.util.Objects;

// Classe abstrata molde que aplica os conceitos de Orientação a Objetos (Herança e Abstração)
public abstract class Moeda {
    private Double valor;

    public Moeda(Double valor) {
        this.valor = valor;
    }

    // Métodos abstratos obrigatórios para as subclasses implementarem
    public abstract void info();

    public abstract Double converter();

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    // Sobrescrita do equals para permitir a remoção correta baseada no valor armazenado
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Moeda moeda = (Moeda) o;
        return Objects.equals(valor, moeda.valor);
    }
}