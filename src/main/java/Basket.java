import java.util.ArrayList;
import java.util.Iterator;

public class Basket<T extends Fruit> {

    ArrayList<T> basketContent;
    Double basketWeight;

    public Basket() {
        basketContent = new ArrayList<>();
        basketWeight = 0.0;
    }

    public Double getBasketWeight() {
        basketWeight = 0.0;
        for (T fruit : basketContent) {
            basketWeight += basketWeight + fruit.getWeight();
        }
        System.out.println("Вес корзины равен " + basketWeight);
        return basketWeight;
    }

    public void add(T fruit) {
        basketContent.add(fruit);
    }

    public Integer compare(Basket<?> comparedBasket) {
        Integer result = null;
        Double thisBasketWeight = basketWeight;
        Double otherBasketWeight = comparedBasket.basketWeight;
        if (thisBasketWeight > otherBasketWeight) {
            result = 1;
        } else if (thisBasketWeight < otherBasketWeight) {
            result = -1;
        } else if (thisBasketWeight.equals(otherBasketWeight)) {
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
