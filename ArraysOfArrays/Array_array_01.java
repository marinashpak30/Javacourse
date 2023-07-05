public class Array_aray_01 {

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

        //начинаем с первого нечетного столбца и потом переходим к следующему (+2)
        System.out.println("Нечетные столбцы, у которых первый элемент больше последнего:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j= j+ 2) {
                if (a[0][j]> a[a.length - 1][j]){
                    System.out.print(" "  + a[i][j] + " ");
                }
            }System.out.println();
        }
    }
}
