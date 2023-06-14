public class Main {

    public static void main(String[] args) {
        Basket<Apple> appleBasket = new Basket<>();
        Basket<Orange> orangeBasket = new Basket<>();
        Basket<Fruit> generalBasket = new Basket<>();

        appleBasket.add(new Apple(Apple.getWeight()));
        appleBasket.add(new Apple(Apple.getWeight()));
        appleBasket.add(new Apple(Apple.getWeight()));
        appleBasket.add(new Apple(Apple.getWeight()));
        appleBasket.getWeight(appleBasket.basketContent);

        orangeBasket.add(new Orange(Orange.getWeight()));
        orangeBasket.add(new Orange(Orange.getWeight()));
        orangeBasket.add(new Orange(Orange.getWeight()));
        orangeBasket.add(new Orange(Orange.getWeight()));
        orangeBasket.getWeight(orangeBasket.basketContent);

        generalBasket.add(new Apple(Apple.getWeight()));
        generalBasket.add(new Apple(Apple.getWeight()));
        generalBasket.add(new Apple(Apple.getWeight()));
        generalBasket.add(new Apple(Apple.getWeight()));
        orangeBasket.add(new Orange(Orange.getWeight()));
        orangeBasket.add(new Orange(Orange.getWeight()));
        orangeBasket.add(new Orange(Orange.getWeight()));
        orangeBasket.add(new Orange(Orange.getWeight()));
        orangeBasket.getWeight(orangeBasket.basketContent);
    }
}
