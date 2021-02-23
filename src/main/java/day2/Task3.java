package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(); //считывание числа a
        int b = s.nextInt(); //считывание числа b
        if (a >= b){
            System.out.println("Некорректный ввод");
        }
        else {
            int i = a;
            while (i < b) {
                if (i != a) {
                    if (i % 5 == 0 && i % 10 != 0) {
                        System.out.print(i + " ");
                    }
                }
                i ++;
            }
        }

    }
}

