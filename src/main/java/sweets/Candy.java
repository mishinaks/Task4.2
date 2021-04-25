package sweets;

public class Candy extends Sweets{
    private String filling;

    public Candy(Double weight, Double price, String filling) {
        super(weight, price);
        this.filling = filling;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String toString(){
        return "Candy [" + super.toString() + ", filling = " + filling + "]";
    }
}
