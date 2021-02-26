package day4;
import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        Random random = new Random();
        int max = 0;
        int flag = 0;
        int [][] arr = new int[12][8]; //основной массив
        int [] sum_arr = new int [12]; //массив для хранения сумм строк основного массива

            for (int i = 0; i < 12; i++){ //перебор строк
                int sum = 0;
                for (int j = 0; j < 8; j++){ //перебор столбцов
                    arr[i][j] = random.nextInt(50); // заполнение массива случайным числами
                    sum = arr[i][j] + sum; // подсчет суммы каждой строки массива
                }
              sum_arr[i] = sum; //заполняем вспомогательный массив суммами строк
            }
        max = sum_arr[0];

            for (int i = 0; i < 12; i++){ //ищем в спомогательном массиве макс сумму
                 if (sum_arr[i] > max){
                max = sum_arr[i];
                flag = i; //сохраняем индекс строки с макс суммой
            }
        }
        System.out.println("Индекс строки, сумма чисел в которой максимальна: " + flag);
    }
}
