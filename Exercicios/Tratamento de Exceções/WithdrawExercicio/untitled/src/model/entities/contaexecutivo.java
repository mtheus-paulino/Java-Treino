package model.entities;

public class contaexecutivo extends Account{
    private double creditoEspecial;

    public contaexecutivo(Integer number, String holder, Double balance, Double withdrawLimit, double creditoEspecial) {
        super(number, holder, balance, withdrawLimit);
        this.creditoEspecial = creditoEspecial;
    }
}
