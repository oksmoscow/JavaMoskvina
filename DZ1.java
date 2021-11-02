class DZ1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    
    static void checkSumSign() {
        int a = -10;
        int b = 2;
        int c = a + b;
        System.out.println (c >= 0? "Сумма положительная" : "Сумма отрицательная");
    }
    
    static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println ("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println ("Желтый");
        }
        if (value > 100) {
            System.out.println ("Зеленый");
        }
    }
    
    static void compareNumbers() {
        int a = 15;
        int b = 15;
        System.out.println (a >= b? "a >= b" : "a < b");
    }
}
