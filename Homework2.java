/**
* Java 1. Homework 2
*
* @autor Oksana
* @version 08.11.2021
*/

class Homework2 {
    public static void main(String[] args) {
        // метод проверяет, что сумма чисел лежит в интервале от 10 до 20 (включительно)
        System.out.println (SumNumbers(2,1));
        System.out.println (SumNumbers(40,50));
        System.out.println (SumNumbers(10,10));
        
        // метод проверяет положительное число или отрицательное (0 - положительное)
        System.out.println (checkNumbers(-32));
        System.out.println (checkNumbers(0));
        
        // метод проверяет отрицательное ли число
        System.out.println (negativeNumbers(-5));
        System.out.println (negativeNumbers(6));
        
        // метод, в котором текст выводится на экран заданное число раз 
        System.out.println (printText("print this text ", 2));
    }
    
    static boolean SumNumbers(int a, int b) {
        int sum = a + b;
        if (sum < 10 || sum > 20) {
            return false;
        } else {
            return true;
        }
    }
    
    static String checkNumbers(int c) {
        return "The number is " + (c >= 0? "positive" : "negative");
    }
    
    static boolean negativeNumbers (int c) {
        return (c >= 0? false : true);
    }
    
    static String printText (String text, int times) {
        for (int i = 1; i < times; i++) {
            System.out.println (text + times + " times");
        }
        return (text + times + " times");
    }
}