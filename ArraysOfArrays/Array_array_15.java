import static java.lang.Math.random;

public class Array_array_15 {

    public static void main(String[] args) {
        int[][] a = {{6, 2, 5, 5, 2},
                {6, 6, 6, 8, 7},
                {8, 2, 2, 5, 5},
                {3, 4, 6, 3, 6},
                {5, 6, 4, 8, 7}}; //массив


        int min = 0;
        int max = 100;
        int numMax = Integer.MIN_VALUE;

        System.out.println("Исходная матрица: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        //ищем наибольший элемент матрицы
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > numMax) {
                    numMax = a[i][j];
                }
            }
        }
        System.out.println("Наибольший элемент матрицы - " + numMax);
        //заменяем все нечетные элементы матрицы на наибольший элемент
        System.out.println("Матрица с замененными нечетными элементами на " + numMax + ":");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] % 2 == 1) {
                    a[i][j] = numMax;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}