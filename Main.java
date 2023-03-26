package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isSumBetween10And20(2, 6)); // false;

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        System.out.println(printString("abcd", 5)); // abcdabcdabcdabcdabcd

        System.out.println(isLeapYear(2000));//true
        System.out.println(isLeapYear(1999));//false
        System.out.println(isLeapYear(1900));//false

        System.out.println(Arrays.toString(retLenArr(5,6)));//
        System.out.println(Arrays.toString(retLenArr(3,3)));//
        
        System.out.println(Arrays.toString(modArr(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0})));

        System.out.println(Arrays.toString(modArrx2(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1})));

        modArrDia(new int[4][4]);
    }
//int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
//int x = array[2][3];
    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        if (a + b > 10 & a + b < 21) {
            return true;
        }
        return false;
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x > 0) {
            return true;
        }
        return false;
    }

    private static String printString(String source, int repeat) {
        // напечатать строку source repeat раз
        return (source.repeat(repeat));
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
        if ((year % 4) == 0) {
            if ((year % 100) == 0) {
                if ((year % 400) == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static int[] retLenArr (int len, int initialValue){
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            String arrayStringPres = Arrays.toString(arr);
        }
        return arr;
    }

    public static int [] modArr(int[] array){
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)
            {
                array[i] = 1;
            }
            else{
                array[i] = 0;
            }
    
        }
        return array;
    }
    public static int [] modArrx2(int[] array){
        //2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)
            {
                array[i]*=2;
            }

        }
        return array;
    }
    public static int [][] modArrDia(int[][] array){
        //заполняет диагоняльные элементы единицами
        for (int i = 0; i < array.length; i++) {
            for (int j = 0, x = array[i].length; j < array[i].length; j++) {
                if (i == j || i == x) {
                    array[i][j] = 1;
                }
                else array[i][j] = 0;
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
        return array;
        
    }
    
}