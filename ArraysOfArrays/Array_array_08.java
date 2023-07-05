import java.io.*;

import static java.lang.Math.random;

public class Array_array_08 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[][] a = {{6, 2, 5, 5, 2},
                {6, 6, 6, 8, 7},
                {8, 2, 2, 5, 5},
                {3, 4, 6, 3, 6},
                {5, 6, 4, 8, 7}}; //массив

        int numMax = 100; //конец диапазона чисел матрицы
        int numMin = 0; // начало диапазона чисел матрицы
        //заполняем матрицу случайными числами
        System.out.println("Исходный массив для замены столбцов:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(" " + a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Введите число от 0 до " + (a.length - 1) + " - номер первого столбца для замены  - ");
        int columnFirst = Integer.parseInt(reader.readLine());
        //проверка правильности введенного числа
        while (true) {
            if (columnFirst < 0 || columnFirst > a.length) {
                System.out.print("Введено неверное число, введите другое - ");
                columnFirst = Integer.parseInt(reader.readLine());
            } else
                break;
        }
        System.out.print("Введите число от 0 до " + (a.length - 1) + " - номер второго столбца для замены  - ");
        int columnSecond = Integer.parseInt(reader.readLine());
        while (true) {
            if (columnSecond < 0 || columnSecond > a.length || columnSecond == columnFirst) {
                System.out.print("Введено неверное число, введите другое - ");
                columnSecond = Integer.parseInt(reader.readLine());
            } else
                break;
        }
        //производим замену столбцов
        for (int i = 0; i < a.length; i++) {
            int temp = a[i][columnFirst];
            a[i][columnFirst] = a[i][columnSecond];
            a[i][columnSecond] = temp;
        }
        //Вывод массива с замененными столбцами
        System.out.println("Массив после замены столбцов");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}