package boxes;

public class Main {

    public static void main(String[] args) {

        MaxWeightBox coffeeBox = new MaxWeightBox(10);
        coffeeBox.add(new Thing("Saludo", -1));
        coffeeBox.add(new Thing("Pirkka", 5));
        coffeeBox.add(new Thing("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInTheBox(new Thing("Saludo")));
        System.out.println(coffeeBox.isInTheBox(new Thing("Pirkka")));
        System.out.println(coffeeBox.isInTheBox(new Thing("Kopi Luwak")));
        System.out.println("--------------");

        OneThingBox box = new OneThingBox();
        box.add(new Thing("Saludo", 5));
        box.add(new Thing("Pirkka", 5));

        System.out.println(box.isInTheBox(new Thing("Saludo")));
        System.out.println(box.isInTheBox(new Thing("Pirkka")));
        System.out.println("--------------");

        BlackHoleBox box2 = new BlackHoleBox();
        box2.add(new Thing("Saludo", 5));
        box2.add(new Thing("Pirkka", 5));

        System.out.println(box2.isInTheBox(new Thing("Saludo")));
        System.out.println(box2.isInTheBox(new Thing("Pirkka")));

    }
}
