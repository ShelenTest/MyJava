package MyPackage;

import java.util.Arrays;

public class HomeWork_3 {

    public static void main(String[] args) {
        int[] firstArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("Задание 1. Before: ");
        printArr(firstArr);
        System.out.println();
        task_1(firstArr);
        System.out.print("After: ");
        printArr(firstArr);
        System.out.println();
        System.out.println("***************************");

        int[] secondArr = new int[100];
        task_2(secondArr);
        printArr(secondArr);
        System.out.println();
        System.out.println("***************************");

        int[] thirdArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        task_3(thirdArr);
        printArr(thirdArr);
        System.out.println();
        System.out.println("***************************");

        int[][] fourthArr = new int [7][7];
        task_4(fourthArr);
        printDoubleArr(fourthArr);
        System.out.println();
        System.out.println("***************************");

        int [] returnFifthArr = task_5(7,88);
        printArr(returnFifthArr);
        System.out.println();
        System.out.println("***************************");

        int [] sixthArr = {783,9,987,8,-2,80,2777,-98};
        task_6_max(sixthArr);
        System.out.print("maxValue = " + task_6_max(sixthArr));
        System.out.println();
        task_6_min(sixthArr);
        System.out.print("minValue = " + task_6_min(sixthArr));
        System.out.println();
        System.out.println("***************************");




    }// 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    //  С помощью цикла и условия заменить 0 на 1, 1 на 0;

    public static void printArr(int[] inputArr) {
        for (int i = 0; i < inputArr.length; i++) {
            System.out.print(inputArr[i] + ", ");
        }
    }

    public static void printDoubleArr(int[][] inputArr) {
        for (int i=0; i<inputArr.length; i++) {
            for (int j=0; j<inputArr[i].length; j++ ) {
                System.out.print(inputArr[i][j] + " ");
            } System.out.println();
        }
    }

    public static void task_1(int[] inputArr) {
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] == 0) {
                inputArr[i]++;
            } else {
                inputArr[i]--;
            }
        }

    }

    // 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void task_2(int[] inputArr) {
        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = i + 1;
        }
    }

    // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void task_3(int[] inputArr) {
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] < 6) {
                inputArr[i] *= 2;
            }
        }
    }
// 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void task_4(int[][] inputArr) {
        for (int i=0; i< inputArr.length; i++) {
            for(int j=0; j<inputArr[i].length; j++) {
                if (inputArr[i]==inputArr[j]) {
                    inputArr[i][j] = 1;
                }
            }
        }
    }

    //5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static int[] task_5 (int len, int initialValue) {
        int [] fifthArr = new int [len];
        for (int i= 0; i< fifthArr.length; i++) {
            fifthArr[i] = initialValue;
        }
        return fifthArr;
    }

    // 6. * Задать одномерный массив и найти в нем минимальный и максимальный значения элементов;
    public static int task_6_max (int [] inputArr) {
        int maxValue = inputArr[0];
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] > maxValue) {
                maxValue = inputArr[i];
            }
        }
        return maxValue;
    }

    public static int task_6_min (int[] inputArr) {
        int mixValue = inputArr[0];
        for (int i=0; i< inputArr.length; i++) {
            if (inputArr[i]<mixValue) {
                mixValue = inputArr[i];
            }
        }
        return mixValue;
    }

}
