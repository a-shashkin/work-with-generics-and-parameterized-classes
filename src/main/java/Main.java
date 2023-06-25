public class Main {

    public static void main(String[] args) {
        Basket<Apple> appleBasket = new Basket<>();
        Basket<Apple> cloneAppleBasket = new Basket<>();
        Basket<Orange> orangeBasket = new Basket<>();
        Basket<Orange> cloneOrangeBasket = new Basket<>();
        Basket<Fruit> generalBasket = new Basket<>();
        Basket<Fruit> cloneGeneralBasket = new Basket<>();
        Basket<Apple> emptyAppleBasket = new Basket<>();
        Basket<Orange> emptyOrangeBasket = new Basket<>();
        Basket<Fruit> emptyFruitBasket = new Basket<>();

        appleBasket.add(new Apple());
        appleBasket.add(new Apple());
        appleBasket.add(new Apple());
        appleBasket.add(new Apple());
        appleBasket.getBasketWeight();

        cloneAppleBasket.add(new Apple());
        cloneAppleBasket.add(new Apple());
        cloneAppleBasket.getBasketWeight();

        orangeBasket.add(new Orange());
        orangeBasket.add(new Orange());
        orangeBasket.add(new Orange());
        orangeBasket.add(new Orange());
        orangeBasket.getBasketWeight();

        cloneOrangeBasket.add(new Orange());
        cloneOrangeBasket.add(new Orange());
        cloneOrangeBasket.add(new Orange());
        cloneOrangeBasket.add(new Orange());
        orangeBasket.getBasketWeight();

        generalBasket.add(new Apple());
        generalBasket.add(new Apple());
        generalBasket.add(new Apple());
        generalBasket.add(new Orange());
        generalBasket.add(new Orange());
        generalBasket.add(new Orange());
        generalBasket.add(new Orange());
        generalBasket.getBasketWeight();

        cloneGeneralBasket.add(new Orange());
        cloneGeneralBasket.add(new Orange());
        cloneGeneralBasket.add(new Apple());

        Integer compareAppleBasketToOrangeBasket = appleBasket.compare(orangeBasket);
        Integer compareGeneralBasketToAppleBasket = generalBasket.compare(appleBasket);
        Integer compareOrangeBasketToClone = orangeBasket.compare(cloneOrangeBasket);
        Integer compareAppleBasketToCloneGeneralBasket = appleBasket.compare(cloneGeneralBasket);

        Basket.transfer(cloneAppleBasket, emptyAppleBasket);
        Basket.transfer(cloneOrangeBasket, generalBasket);
        Basket.transfer(cloneGeneralBasket, generalBasket);
        Basket.transfer(orangeBasket, emptyOrangeBasket);
        Basket.transfer(generalBasket, emptyFruitBasket);

        System.out.println("Пара-пара-пам... Всё!");
    }
}
