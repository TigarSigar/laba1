package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Задание 1");
        List<String> result1 = fizzbuzz(500);
        System.out.println(result1);

        System.out.println("Задание 2");
        String result2 = reversePrint("make install");
        System.out.println(result2);

        System.out.println("Задание 3");
        ArrayList<String> list = solveEquation(1, -3, 2);
        System.out.println(list);

        System.out.println("Задание 4");
        double sum = summary();
        System.out.println(sum);

        System.out.println("Задание 5");
        Boolean result5 = palindrom("FiziF");
        System.out.println(result5);
    }

    public static List<String> fizzbuzz(int n)
    {
        List<String> result1 = new ArrayList<>();

        for (int i = 1; i <= n; i++)
        {
            if (i % 5 == 0)
            {
                if (i % 7 == 0)
                {
                    result1.add("FizzBuzz");
                }
                else
                {
                    result1.add("Fizz");
                }
            }
            else if (i % 7 == 0)
            {
                result1.add("Buzz");
            }
            else
            {
                result1.add(String.valueOf(i));
            }
        }
        return result1;
    }

    public static String reversePrint(String input)
    {
        StringBuilder reverse = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--)
        {
            reverse.append(input.charAt(i));
        }
        return reverse.toString();
    }

    public static ArrayList<String> solveEquation(double a, double b, double c)
    {
        ArrayList<String> list = new ArrayList<>();
        double D = b * b - 4 * a * c;

        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);

            list.add(String.valueOf(x1));
            list.add(String.valueOf(x2));
        } else if (D == 0) {
            double x = (-b) / (2.0 * a);
            list.add(String.valueOf(x));
        } else {
            list.add("Нет корней");
        }

        return list;
    }

    public static double summary()
    {
        ArrayList<String> list = new ArrayList<>();

        int n = 2;
        double sum = 0;
        double i = 0;

        do {
            i = 1.0 / (n * n + n - 2);
            sum += i;

            n++;
        } while (i > Math.pow(10, -6));

        return sum;
    }

    public static boolean palindrom(String input)
    {
        char[] chars = input.toCharArray();
        String pali = "";

        for (int i = input.length() - 1; i >= 0; i--)
        {
            pali += chars[i];
        }
        return input.equals(pali);
    }
}