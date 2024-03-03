package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Category category1 = new Category("słodycze", "coś słodkiego dla każdego");
        Category category2 = new Category("gry komputerowe", "gry akcji i platformówki");
        Product product1 = new Product(category1, "guma turbo", "najlepsza guma dostępna na rynku", 0.10);
        Product product2 = new Product(category1, "czekolada", "smak dzieciństwa", 6.45);
        Product product3 = new Product(category2, "Baldurs Gate III", "nowe RPG, gra roku", 249.0);
        SpecialOffer offer1 = new SpecialOffer(product3, "zniżka z okazji miesiąca gier RPG",
                "03.03.2024 - 03.04.2024", 0.2);
        System.out.printf("Nazwa produktu: %s%nOpis produktu: %s%nKategoria produktu: %s%nCena: %.2fzł%n%n",
                product1.name, product1.info, product1.category.name, product1.price);
        System.out.printf("Nazwa produktu: %s%nOpis produktu: %s%nKategoria produktu: %s%nCena: %.2fzł%n%n",
                product2.name, product2.info, product2.category.name, product2.price);
        System.out.printf("Nazwa produktu: %s%nOpis produktu: %s%nKategoria produktu: %s%nOferta: %s%n" +
                        "Cena bez oferty: %.2fzł%nCena z ofertą: %.2fzł%n%n",
                offer1.product.name, offer1.product.info, offer1.product.category.name, offer1.info,
                offer1.product.price, offer1.product.price * (1.0 - offer1.amount));
    }
}
