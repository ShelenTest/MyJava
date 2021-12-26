package MyPackage.HomeWork_6;

public class Cat extends Animals {
    public Cat(String color, String type, String name) {
        super(color, type, name);
    }

    public void run (int a) {
        if (a <= 200) {
            System.out.println(color +" " + type +" "+ name + " пробежал дистанцию " +  a);
        }
        else {
            System.out.println(color + " " + type +" "+ name + " не добежал ");
        }
    }

    public static void swim () {
        System.out.println("Коты не умеют плавать");
    }
}
