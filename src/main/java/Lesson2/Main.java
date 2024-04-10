package Lesson2;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumCheck(5, 7));
        checkPositive(2);
        System.out.println(checkNegative(-6));
        printStringNTimes("Java4Android", 4);
        int year = 2077;
        System.out.printf("Год %d - високосный - %b\n" ,year ,checkYearLeap(year));
    }
    //1 задание
    public static boolean sumCheck(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    //2 задание
    public static void checkPositive(int a) {
        System.out.println(a >= 0? "Число Положительное" : "Число Отрицательное");
    }
    //3 задание
    public static boolean checkNegative(int a){
        return (a <= 0);
    }
    //4 задание
    public static void printStringNTimes(String str, int n){
        for (int i = 1; i <= n; i++) {
            System.out.println(str);
        }
    }
    // 5 задание
    public static boolean checkYearLeap (int year){
        if (year % 400 == 0){
            return true;
        }
        else if (year % 100 == 0){
            return false;
        }
        else {
            return year % 4 == 0;
        }
    }
}
