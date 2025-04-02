import model.*;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food[] products = {
                new Meat(5, 100),
                new Apple(10, 50, Colour.RED),
                new Apple(8, 60, Colour.GREEN)
        };

        ShoppingCart cart = new ShoppingCart(products);

        System.out.println("Общая сумма товаров без скидки: " + cart.getTotalPriceWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalPriceWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getVegetarianTotalPrice());
    }
}
