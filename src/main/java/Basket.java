import java.util.ArrayList;
import java.util.Iterator;

public class Basket<T extends Fruit> {

    ArrayList<T> basketContent = new ArrayList<>();
    Float basketWeight = 0.0f;

    Float getWeight(ArrayList<T> basketContent) {

        Iterator<T> iterator = basketContent.iterator();
        while (iterator.hasNext()) {
            basketWeight = basketWeight + basketContent.iterator().next().getWeight();
        }
        return basketWeight;
    }

    void add(Fruit fruit) {
        basketContent.add((T) fruit);
    }

    Integer compare(Basket<T> basket2) {
        Integer result = null;
        Float thisBasketWeight = basketWeight;
        Float otherBasketWeight = basket2.basketWeight;
        if (thisBasketWeight > otherBasketWeight) {
            result = 1;
        } else if (thisBasketWeight < otherBasketWeight) {
            result = -1;
        } else if (thisBasketWeight == otherBasketWeight) {
            result = 0;
        }
        return result;
    }

    void transfer(Basket<T> basket2) {
        Iterator<T> thisBasketIterator = basketContent.iterator();
        while (thisBasketIterator.hasNext()) {
            basket2.add(basketContent.iterator().next());
            basketContent.remove(basketContent.iterator().next());
        }
    }
}
