package MyPackage.HomeWork_6;

public class HomeWork_6 {
    public static void main (String[] args) {
        Cat cat1 = new Cat("серый", "кот", "Василий");
        Cat cat2 = new Cat("рыжая", "кошка", "Рыся");
        Cat cat3 = new Cat("рыжая", "кошка", "Муся");
        Dog dog1 = new Dog ("пягой", "пес", "Мишель");
        Dog dog2 = new Dog ("черный", "пес", "Колька");


        cat1.run(100);
        cat2.run(250);
        cat3.swim();
        dog1.run(40);
        dog2.swim(15);
    }

}

