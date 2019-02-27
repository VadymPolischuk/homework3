package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // first();
        //second();
        //third();
        //fourth();
        //fifth();
        //sixth();
        //seventh();
        //eighth();
        //ninth();
        //tenth();
        //eleventh();
    }

    private static void eleventh() {
        Scanner scanner = new Scanner(System.in);
        int swt;
        swt = scanner.nextInt();
        switch (swt) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 25; j++) {
                        System.out.print("*");

                    }
                    System.out.println();

                }
                break;
            case 2:
                for (int i = 0; i <10 ; i++) {
                    for (int j = 0; j <i ; j++) {
                        System.out.print("*");

                    }
                    System.out.println();

                }
        }
    }


    private static void tenth() {

        int z = 0, a = 1, b = 4, sum, count = 1;
        for (sum = 1; sum <= 10; sum++) {
            z++;
            a += b;
            count += a;
            System.out.println(a);
            if (z == 10) {
                System.out.println("\t" + (count - 1));
                break;
            }

        }


    }

    private static void ninth() {
        Scanner scanner = new Scanner(System.in);
        int b = 4, z, sum = 0;
        z = scanner.nextInt();
        for (int a = 2; a <= z; a += b) {
            sum++;
        }
        System.out.println(sum);
    }

    private static void eighth() {

        int a = 1, b;
        b = 500;
        do {
            b++;
            if ((b % 13 == 0) && (b % 17 == 0)) {
                a++;
                System.out.println(b);
            }
        }
        while (a <= 20);
    }

    private static void seventh() {
        int a = 0, b;
        b = 100;
        do {
            b++;
            if (b % 19 == 0) {
                a++;
                System.out.println(b);
            }


        }
        while (a <= 15);
    }

    private static void sixth() {
        int x, y, k;
        for (x = 1; x < 30; x++) {
            for (y = 1; y < 30; y++) {
                for (k = 1; k < 30; k++) {
                    if (x * x + y * y == k * k)
                        System.out.println(x + "\t" + y + "\t" + k);
                }
            }

        }

    }

    private static void fifth() {
        Scanner scanner = new Scanner(System.in);
        double x = 0, sum = 0, zn = 1, p;
        x = scanner.nextDouble();
        for (int i = 1; i < 15; i++) {
            double ch = i + x;
            zn *= i;
            p = ch / zn;
            sum += p;
            System.out.println(sum);

        }

    }

    private static void fourth() {
        double sum = 1, n, x, p = 1, fz = 1, k;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextDouble();
        x = scanner.nextDouble();
        k = scanner.nextDouble();
        for (int i = 1; i <= 20; i++) {
            for (double j = k; j <= n; j++) {
                k *= j;
                sum += x / fz;

            }
            System.out.println(sum);
        }

    }

    private static void third() {


    }

    private static void second() {
        double y, a = 3, b = -5, x, h = 0.5;

        for (x = 1; x < 5; x += h) {

            y = a * x * x + b;
            System.out.println(y);

        }


    }

    private static void first() {
        double f, f1, f2, a = 0, b = 5, h = 1;
        for (; a <= b; a += h) {
            f = a - Math.sin(a);
            f1 = Math.pow(Math.sin(a), 2);
            f2 = (2 * Math.cos(a)) - 1;
            System.out.println((int) a + " " + f + "\t" + f1 + "\t" + f2);

        }


    }
}

