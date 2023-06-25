import java.util.ArrayList;
import java.util.Iterator;
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
        Integer result = null;
        double thisBasketWeight = getBasketWeight();
        double otherBasketWeight = comparedBasket.getBasketWeight();
        if (thisBasketWeight > otherBasketWeight) {
            result = 1;
        } else if (thisBasketWeight < otherBasketWeight) {
            result = -1;
        } else if (thisBasketWeight == otherBasketWeight) {
            result = 0;
        }
        return result;
    }

    void transfer(Basket<T> recipientBasket) {
        Iterator<T> thisBasketIterator = basketContent.iterator();
        while (thisBasketIterator.hasNext()) {
            recipientBasket.add(basketContent.iterator().next());
            basketContent.remove(basketContent.iterator().next());
        }
    }
}
