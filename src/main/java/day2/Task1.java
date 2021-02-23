package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if (number <= 0){ //проверка ввода
            System.out.println("Ошибка ввода");
        }
        else if (number <= 4){
            System.out.println("Малоэтажный дом");
        }
        else if (number >= 5 && number <=8){
            System.out.println("Среднеэтажный дом");
        }
        else if (number >= 9){
            System.out.println("Многоэтажный дом");
        }
    }
}
