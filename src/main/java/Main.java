public class Main {

    public static void main(String[] args) {
        Basket<Apple> appleBasket = new Basket<>();
        Basket<Orange> orangeBasket = new Basket<>();
        Basket<Fruit> generalBasket = new Basket<>();

        appleBasket.add(new Apple());
        appleBasket.add(new Apple());
        appleBasket.add(new Apple());
        appleBasket.add(new Apple());
        appleBasket.getBasketWeight();

        orangeBasket.add(new Orange());
        orangeBasket.add(new Orange());
        orangeBasket.add(new Orange());
        orangeBasket.add(new Orange());
        orangeBasket.getBasketWeight();

        generalBasket.add(new Apple());
        generalBasket.add(new Apple());
        generalBasket.add(new Apple());
        generalBasket.add(new Orange());
        generalBasket.add(new Orange());
        generalBasket.add(new Orange());
        generalBasket.add(new Orange());
        generalBasket.getBasketWeight();
    }
}
