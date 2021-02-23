package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(); //считывание числа a
        int b = s.nextInt(); //считывание числа b
        if (a >= b){
            System.out.println("Некорректный ввод");
        }
        else {
            for (int i = a; i < b; i = i + 1) {
                if (i != a) {
                    if (i % 5 == 0 && i % 10 != 0) {
                        System.out.print(i + " ");
                    }
                }
            }
        }

    }
}
