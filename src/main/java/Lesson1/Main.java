package Lesson1;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        sum();
        printColor();
        compareNumbers();
    }
        static void printThreeWords() {

            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }
        static void checkSumSign() {
        int a = 5;
        int b = 7;
            System.out.println(a + b);
        }
        static void sum() {
        int sum = 12;
        if (sum >= 0){
            System.out.println("Сумма положительная");
            } else if (sum <0){
                System.out.println("Сумма отрицательная");
            }
        }
        static void printColor() {
        int value = 1;
        if (value <= 0){
            System.out.println("Красный");
        }else if (value > 0 && value <= 100){
            System.out.println("Желтый");
        }else if (value > 100){
            System.out.println("Зеленый");
        }
        }
        static void compareNumbers() {
        int a = 3;
        int b = 6;
        if (a >= b){
            System.out.println("a >= b");
        }else if (a < b){
            System.out.println("a < b");
        }
        }
}
