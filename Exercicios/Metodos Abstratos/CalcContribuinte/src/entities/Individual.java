package entities;

public class Individual extends TaxPayer {
    private Double healthExpenditures = 0.0;

    public Individual(String name, Double rendaAnual, Double healthExpenditures) {
        super(name, rendaAnual);
        this.healthExpenditures = healthExpenditures;
    }


    @Override
    public Double tax() {
        double valorPago = 0.0;
        if (getAnualIncome() < 20000 && healthExpenditures == 0.0){
            return getAnualIncome() * 0.15;
        } else {
            return (getAnualIncome() * 0.25) - (healthExpenditures * 0.5);
        }
    }
}
