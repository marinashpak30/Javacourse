import static java.lang.Math.random;

public class Array_array_10 {

    public static void main(String args[]) {
        int[][] a = {{6, 2, 5, 5, 2},
                {6, 6, 6, 8, 7},
                {8, 2, 2, 5, 5},
                {3, 4, 6, 3, 6},
                {5, 6, 4, 8, 7}}; //массив

        int k = 0;
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < a.length; i++) { //заполняем матрицу случайными числами
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(" " + a[i][j] + " ");
            }
            System.out.println();
        }

        //находим положительные элементы главной диагонали матрицы
        System.out.print("Положительные элементы главной диагонали матрицы: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i][i] > 0) {
                System.out.print(a[i][i] + " ");
                k++;
            }
        }
        //вывод сообщения, если положительные элементы отсутствуют
        if (k == 0) {
            System.out.println("отсутсвуют");
        }
    }
}
