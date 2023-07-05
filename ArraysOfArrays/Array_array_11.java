import static java.lang.Math.*;

public class Array_array_11 {

    public static void main(String args[]) {
        int[][] a = {{6, 2, 5, 5, 2},
                {6, 6, 6, 8, 7},
                {8, 2, 2, 5, 5},
                {3, 4, 6, 3, 6},
                {5, 6, 4, 8, 7}}; //массив

        int k = 0;
        int k1 = 0;
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < a.length; i++) { //заполняем матрицу случайными числами
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(" " + a[i][j] + " ");
            }
            System.out.println();
        }

        //поиск чисел 5
        System.out.print("Номера строк, в которых число 5 встречается 3 и более раз: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 5) {
                    k++;
                }
            }
            if (k >= 3) {
                System.out.print(i + " ");
                k1++;
            }
            k = 0;
        }
        if (k1 == 0) {
            System.out.println("такие строки отсутствуют");
        }
    }
}

