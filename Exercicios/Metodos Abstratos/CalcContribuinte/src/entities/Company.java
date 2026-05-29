package entities;

public class Company extends TaxPayer {
    private Integer numberOfEmployees;

    public Company(String name, Double rendaAnual, Integer numberOfEmployees) {
        super(name, rendaAnual);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        if (numberOfEmployees > 10){
            return getAnualIncome() * 0.14;
        }else
            return getAnualIncome() * 0.16;
    }
}
