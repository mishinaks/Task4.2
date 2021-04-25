import sweets.Candy;
import sweets.Сookies;
import sweets.Jellybean;
import  sweets.Sweets;

public class Base {
    public static void main(String[] args) {
        Candy candy1 = new Candy(15.5, 26.6,"chocolate");
        Сookies cookies1 = new Сookies(50.2, 30.0, "circle");
        Jellybean jellybean1 = new Jellybean(10.5, 20.5,"strawberry");
        Jellybean jellybean2 = new Jellybean(13.8, 22.5,"apple");
        Sweets[] present = {candy1, cookies1, jellybean1, jellybean2};
        double presentWeiht = 0;
        double presentPrice = 0;
        for (Sweets someSweets : present){
            presentWeiht += someSweets.getWeight();
            presentPrice += someSweets.getPrice();
            System.out.println(someSweets.toString());
        }
        System.out.println("Present weight = " + presentWeiht + " g.;");
        System.out.println("Present price = " + presentPrice + " rub.");
    }
}
