public class Main {

    public static void main(String[] args) {

    }

    public <T extends Fruit> void addFruitToBasket(Fruit fruit, Basket<T> basket) {
        basket.basketContent.add((T) fruit);
    }
}
