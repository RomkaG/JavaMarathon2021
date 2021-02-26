package day4;
import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
      Random random = new Random();
      int [] arr = new int[100];//основной массив
      int [] sum_arr = new int[98];//вспомогательный массив
      int sum = 0;
      int max = 0;
      int flag = 0;

      for (int i = 0; i < 100; i++ ){ //генерация массива случайных чисел
          arr [i] = random.nextInt(10000);
      }

      for (int i = 0; i < 98; i++){//записываем сумму троек в вспомогательный массив
        sum = arr[i] + arr[i+1] + arr[i+2];
        sum_arr[i] = sum;
          if (sum_arr[i] > max) {
              max = sum_arr[i];
              flag = i;
          }
      }
      System.out.println("Сума максимальной тройки: " + max);
      System.out.println("Индекс первого элемента макс тройки: " + flag);
    }
}
