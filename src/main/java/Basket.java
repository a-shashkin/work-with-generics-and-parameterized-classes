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
}
