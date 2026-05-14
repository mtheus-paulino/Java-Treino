package entities;

public class ImportedProduct extends Product {

    private Double CustomsFee;

    public ImportedProduct(String name, double price, Double customsFeee) {
        super(name, price);
        CustomsFee = customsFeee;
    }

    public Double getCustomsFee() {
        return CustomsFee;
    }

    public void setCustomsFee(Double customsFee) {
        CustomsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return String.format("%s $ %.2f (Customs fee: $ %.2f",
                getName(),
                totalPrice(),
                getCustomsFee());
    }

    public Double totalPrice(){
        setPrice(getPrice() + getCustomsFee());
        return  getPrice();
    }
}
