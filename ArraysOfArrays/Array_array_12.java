
public class Array_array_12 {

    public static void main(String[] args) {
        int[][] a = {{6, 2, 5, 5, 2},
                {6, 6, 6, 8, 7},
                {8, 2, 2, 5, 5},
                {3, 4, 6, 3, 6},
                {5, 6, 4, 8, 7}}; //массив

        int min = 0;
        int max = 100;
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        //сортируем строки матрицы по возрастанию
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i].length - 1; k++) {
                    if (a[i][k] > a[i][k + 1]) {
                        int temp = a[i][k];
                        a[i][k] = a[i][k + 1];
                        a[i][k + 1] = temp;
                    }
                }
            }
        }
        System.out.println("Строки отсортированы по возрастанию:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        //сортируем строки матрицы по убыванию
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i].length - 1; k++) {
                    if (a[i][k] < a[i][k + 1]) {
                        int temp = a[i][k + 1];
                        a[i][k + 1] = a[i][k];
                        a[i][k] = temp;
                    }
                }
            }
        }
        System.out.println("Строки отсортированы по убыванию:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}