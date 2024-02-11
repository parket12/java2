package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 стороны треугольника:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if ((a*a + b*b == c*c) | (b*b + c*c == a*a) | (c*c + a*a == b*b)) {
            System.out.println("Ваш треугольник прямоугольный");
        }
        else if ((a == b) && (b == c))
        {
            System.out.println("Ваш треугольник равносторонний");
        }
        else if ((a == b) || (b == c) || (c == a))
        {
            System.out.println("Ваш треугольник равнобедренный");
        }
        else if (a + b <= c || b + c <= a|| c + a <= b)
        {
            System.out.println(a + ", " + b + " и " + c + " не являются сторонами треугольника" );
        }
        else
        {
            System.out.println("Ваш треугольник самый, что ненаесть обычный");
        }

    }
}