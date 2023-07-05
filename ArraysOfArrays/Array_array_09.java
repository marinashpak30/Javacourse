import static java.lang.Math.*;

public class Array_array_09 {

    public static void main(String args[]) {

        System.out.println("Ввод числа:  ");
        Scanner in = new Scanner(System.in);

        int[] [] a = {{6, 2, 5, 5, 2},
                {6, 6, 6, 8, 7},
                {8, 2, 2, 5, 5},
                {3, 4, 6, 3, 6},
                { 5, 6, 4, 8, 7}};

        //массив
        int[] sum = new int[a[0].length];
        int maxsum= 0;
        int k = 0;
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < a.length; i++) { //заполняем матрицу случайными числами
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(" " + a[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sum[i] += a[j][i];
            }
            if (sum[i] > maxsum) {
                maxsum = sum[i];
                k = i;
            }
        }
        int k1=k+1;
        System.out.println("Столбец № " + k1 + " содержит максимальную сумму чисел, равную sum = " + sum[k]);
    }
}
