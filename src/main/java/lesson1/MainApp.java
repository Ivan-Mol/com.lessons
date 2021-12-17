package lesson1;

import lesson1.animals.Animal;
import lesson1.animals.Cat;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik","White",3,1);
        Cat cat2 = new Cat("Murzik","Black",4,1);

        Cat[] cats = new Cat[2];
        cats[0] = cat;
        cats[1] = new Cat("Bob","Green",20,1);
        Cow cow1 = new Cow("Zina","White",9);
        cat.voice();
        cow1.voice();

        //может использовать только методы Animal
        Animal cat3 = new Cat("Sam","red",2,2);
        ((Cat)cat3).onlyCatMethod(); // указание на то что это именно кот
        System.out.println(cat3.toString());

        Box box1 = new Box("Green",3);
        Box box2 = new Box("Green",3);
        System.out.println(box1.equals(box2));
        System.out.println(box1.hashCode());
        System.out.println(box2.hashCode());
    }
//закончил на 01:47:54
}
