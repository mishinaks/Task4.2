package sweets;

public class Jellybean extends Sweets{
    private String taste;

    public Jellybean(Double weight, Double price, String taste) {
        super(weight, price);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString(){
        return "Jellybean [" + super.toString() + ", taste = " + taste + "]";
    }
}
