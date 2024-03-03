package pl.javastart.task;

public class Product {
    Category category;
    String name;
    String info;
    double price;
    Product(Category cat, String n, String i, double p){
        category = cat;
        name = n;
        info = i;
        price = p;
    }
}
