package sweets;

public class Сookies extends Sweets{
    private String shape;

    public Сookies(Double weight, Double price, String shape) {
        super(weight, price);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString(){
        return "Сookies [" + super.toString() + ", shape = " + shape + "]";
    }
}
