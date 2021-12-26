package MyPackage.HomeWork_6;

public class Dog extends Animals{
    public Dog(String color, String type, String name) {
        super(color, type, name);
    }

    public void run (int a) {
        if (a <= 500) {
            System.out.println(color +" " + type +" "+ name + " пробежал дистанцию " +  a);
        }
        else {
            System.out.println(color + " " + type +" "+ name + " не добежал ");
        }
    }
    public void swim (int b) {
        if (b <= 10) {
            System.out.println(color +" " + type +" "+ name + " проплыл дистанцию " +  b);
        }
        else {
            System.out.println(color + " " + type +" "+ name + " не доплыл ");
        }
    }
}
