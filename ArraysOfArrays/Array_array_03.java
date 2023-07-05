import static java.lang.Math.random;

public class Array_aray_03 {
    public static void main(String args[]) {
        int[] [] a = {{6, 2, 5, 5, 2},
                {6, 6, 6, 8, 7},
                {8, 2, 2, 5, 5},
                {3, 4, 6, 3, 6},
                { 5, 6, 4, 8, 7}}; //массив

        int k = (int) (random() * ((a.length - 1) + 1));//индекс строки для вывода
        int p = (int) (random() * ((a[0].length - 1) + 1));//индекс столбца для вывода

        System.out.println("Исходная матрица: ");
        for (int i = 0; i < a.length; i++) { //заполняем матрицу случайными числами
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(" " + a[i][j] + " ");
            }
            System.out.println();
        }

        //следует учесть что счет начинается с 0 !!!

        System.out.print("Вывод строки с индексом k = " + k + ": ");
        for (int j = 0; j < a[k].length; j++) {
            System.out.print(a[k][j] + " ");
        }
        System.out.print("\nВывод столбца с индексом p = " + p + ": ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i][p] + " ");

        }
    }
}
