package com.pb.gordienko.hw2;

import java.util.Scanner;

public class Interval {

    private static Scanner in;

    public static void main(String[] args) {

        byte a = 0, b = 14, d = 15, e = 35, f = 36, g = 50, k = 51, n = 100;

        System.out.print("Проверка попадания числа в интервал от 0 до 100" + "\n" + "Введите целое число: ");

        in = new Scanner(System.in);
        byte i = in.nextByte();

        if (a <= i && i <= b) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + a + " до " + b + "\n");
        } else if (d <= i && i <= e) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + d + " до " + e + "\n");
        } else if (f <= i && i <= g) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + f + " до " + g + "\n");
        } else if (k <= i && i <= n) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + k + " до " + n + "\n");
        } else if (n <= i) {
            System.out.print("Ваше число " + i + " не попадает ни в один интервал");
        } else if (a <= -i && -i <= n) {
            System.out.print("Ваше число " + i + " является отрицательным");
        }
    }
}