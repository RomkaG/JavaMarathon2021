package day4;
import java.util.Random;
public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int Max = 0; //максимальный элемент массива
        int count = 0; //счетчик чисел кратных 10
        int sum = 0; //сумма чисел кратных 10
        int t = 0;
        Random rnd = new Random();
        while (t < 100) { //заполнение массива
            arr[t] = rnd.nextInt(10000);//запись случайного значения в массив
            t = t + 1;
        }
        int Min = arr[0];
        for (int w: arr) { //перебор элементов в массиве
            if (w > Max) { //поиск макс элемента
                Max = w;
            } else if (w < Min) { //поиск мин элемента
                Min = w;
            }
            if (w % 10 == 0) { //поиск элемента кратного 10
                count++;
                sum = sum + w; //сума таких элементов
            }

        }
        System.out.println("Наибольший элемент массива: " + Max);
        System.out.println("Наменьший элемент массива: " + Min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + count);
        System.out.println("Сумма элементов, оканчивающихся на 0: " + sum);
    }
}
