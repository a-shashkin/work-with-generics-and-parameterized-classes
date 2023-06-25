import java.util.ArrayList;
import java.util.List;

public class Basket<T extends Fruit> {

    private List<T> basketContent;

    public Basket() {
        basketContent = new ArrayList<>();
    }

    public double getBasketWeight() {
        double basketWeight = 0.0;
        for (T fruit : basketContent) {
            basketWeight += fruit.getWeight();
        }
        System.out.println("Вес корзины равен " + basketWeight);
        return basketWeight;
    }

    public void add(T fruit) {
        basketContent.add(fruit);
    }

    public Integer compare(Basket<?> comparedBasket) {
        System.out.println("Идёт сравнение корзин...");
        Integer result = null;
        double thisBasketWeight = getBasketWeight();
        double otherBasketWeight = comparedBasket.getBasketWeight();
        if (thisBasketWeight > otherBasketWeight) {
            result = 1;
            System.out.println("Первая корзина тяжелее второй.");
        } else if (thisBasketWeight < otherBasketWeight) {
            result = -1;
            System.out.println("Вторая корзина тяжелее первой.");
        } else if (thisBasketWeight == otherBasketWeight) {
            result = 0;
            System.out.println("Вес корзин одинаков.");
        }
        return result;
    }

    public static <U extends Fruit> void transfer(Basket<U> sourceBasket, Basket<? super U> recipientBasket) {
        recipientBasket.basketContent.addAll(sourceBasket.basketContent);
        sourceBasket.basketContent.clear();
    }
}
