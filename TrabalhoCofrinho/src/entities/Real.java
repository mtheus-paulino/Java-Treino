package entities;

public class Real extends Moeda {

    public Real(Double valor) {
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
        System.out.printf("Real: %.2f%n", getValor() );
    }

    @Override
    public Double converter() {
        return getValor();
    }




}
