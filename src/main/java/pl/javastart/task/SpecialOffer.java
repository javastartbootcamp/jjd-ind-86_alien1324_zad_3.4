package pl.javastart.task;

public class SpecialOffer {
    Product product;
    String info;
    String duration;
    double amount;
    SpecialOffer(Product prod, String i, String dur, double am){
        product = prod;
        info = i;
        duration = dur;
        amount = am;
    }
}
