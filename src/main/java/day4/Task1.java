package day4;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int c1 = 0; //счетчик чисел больше 8
        int c2 = 0; //счетчик чисел равных 1
        int c3 = 0; //счетчик четных чисел
        int c4 = 0; //счетчик нечетных чисел
        int sum_elem = 0; //сумма элементов массива
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите размер массива: ");
        int n = scanner.nextInt(); //считываем длину массива
        int [] array = new int[n];

        for (int i = 0; i < n; i++) { //цикл для записи случайных значении в массив
            array[i] = (int) Math.ceil(Math.random() * 10);//запись случайного значения в массив в диапазоне 0...10

            if (array[i] > 8) {
                c1++;
            }
            else if (array[i] == 1){
                c2++;
            }
            if (array[i] % 2 == 0){
                c3++;
            }
            else {
                c4++;
            }
            sum_elem = sum_elem + array[i];
        }
        System.out.println();
        System.out.println("Введено число " + n);
        System.out.print("Сгенерирован следующий массив:");
	    System.out.println(Arrays.toString(array));
	    System.out.println("Длина массива: " + n);
	    System.out.println("Количество чисел больше 8: " + c1);
        System.out.println("Количество чисел равных 1: " + c2);
        System.out.println("Количество четных чисел:  " + c3);
        System.out.println("Количество нечетных чисел:  " + c4);
        System.out.println("Сумма всех элементов массива: " + sum_elem);
    }
}