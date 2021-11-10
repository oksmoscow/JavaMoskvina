/**
* Java 1. Homework 3
*
* @autor Oksana
* @version 10.11.2021
*/

import java.util.Arrays;

class Homework3 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonals();
        System.out.println(Arrays.toString(setArray(3,4)));
    }
    
    // Метод, в котором заменяются 0 на 1 и 1 на 0
    static void invertArray() {
        int[] arr = {1, 1, 0, 1, 0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? (arr[i] = 1) : (arr[i] = 0);
        }
        System.out.println(Arrays.toString(arr) + "\n");
    }
    
    // Метод, заполняющий массив от 1 до 100
    static void fillArray() {
        int[] arr = new int [100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + i;
        }
        System.out.println(Arrays.toString(arr) + "\n");
    }
    
    // Метод, в котором числа массива менее 6 умножаются на 2
    static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr) + "\n");
    }
    
    // Метод, заполняющий единицами  диагонали кубического массива
    static void fillDiagonals() {
        int[][] table = new int[5][5];
        for (int i = 0; i < table.length; i++) {
            table[i][i] = 1;
            table[i][table.length - 1 - i] = 1;
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Метод, возвращающий массив длинной len со значениями initialValue
    static int[] setArray(int len, int initialValue) {
        int[] arr = new int [len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
