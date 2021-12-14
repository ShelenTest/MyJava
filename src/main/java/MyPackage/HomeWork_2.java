package MyPackage;

public class HomeWork_2 {
    public static void main(String[] args) {
        System.out.println(task_1(90, 9));
        task_2(-8);
        System.out.println(task_3(0));
        task_4("Зеленый попугай", 3);
    }

    public static boolean task_1(int a, int b) {
        return ((a + b) >= 10 && (a + b) <= 20);
    }

    public static void task_2(int c) {
        if (c >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean task_3(int x) {
        return (x >= 0);
    }

    public static void task_4(String myString, int y) {
        for (int i = 0; i < y; i++) {
            System.out.println(myString);
        }
    }
}
