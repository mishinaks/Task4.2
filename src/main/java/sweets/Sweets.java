package sweets;

public abstract class Sweets {
    private Double weight;
    private Double price;

    public Sweets(Double weight, Double price) {
        this.weight = weight;
        this.price = price;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "weight = " + weight + ", price =" + price;
    }
}
