public class Array_aray_02 {

    public static void main(String args[]) {
        int[] [] a = {{6, 2, 5, 5, 2},
                {6, 6, 6, 8, 7},
                {8, 2, 2, 5, 5},
                {3, 4, 6, 3, 6},
                { 5, 6, 4, 8, 7}}; //массив

        System.out.println("Исходная матрица: ");
        for (int i = 0; i < a.length; i++) { //заполняем матрицу случайными числами
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(" " + a[i][j] + " ");
            }
            System.out.println();
        }

        // диагональ матрицы слева направа (в этом случае [i] [j=i])
        System.out.println("Диагональ матрицы слева направо: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i][i] + " ");
        }
        // диагональ матрицы справа налево (в этом случае [i] [j=(length-1)-i]
        System.out.println("\nДиагональ матрицы справо налево: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i][a.length - 1 - i] + " ");
        }
    }
}
