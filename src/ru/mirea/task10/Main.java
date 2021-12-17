package ru.mirea.task10;

import java.util.Scanner;

class Recursion {

    public static String Triangle (int n) {
        int sum = 0;
        int k = 0;
        if (n == 1) {
            return ("1");
        }
        else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                k = i;
            }
            return (Triangle(n - 1) + " " + k);
        }
    }

    public static String From1toN(int n) {
        if (n == 1) {
            return "1";
        }
        return From1toN(n - 1) + " " + n;
    }

    public static String AB(int a, int b) {
        if (a < b) {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + AB(a + 1, b);
        } else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + AB(a - 1, b);
        }
    }

    public static int SumOfDigits(int n) {
        if (n < 10) {
            return n;
        }
        else {
            return n % 10 + SumOfDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задание 1");
        System.out.print("Введите число: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(n + " первых чисел треугольной последовательности: " + Triangle(n));
        Scanner sc1 = new Scanner(System.in);
        System.out.println("\nЗадание 2");
        System.out.print("Введите число: ");
        n = Integer.parseInt(sc.nextLine());
        System.out.println("Последовательность чисел от 1 до " + n + ": " + From1toN(n));
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("\nЗадание 3");
        System.out.print("Введите числа А и В: ");
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("Последовательность чисел от " + a + " до " + b +": "+ AB(a,b));
        Scanner sc4 = new Scanner(System.in);
        System.out.println("\nЗадание 4");
        System.out.print("Введите число: ");
        n = Integer.parseInt(sc.nextLine());
        System.out.println("Сумма цифр числа " + n + " равна " + SumOfDigits(n));
    }
}