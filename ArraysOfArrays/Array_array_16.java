import static java.lang.Math.random;

public class Array_array_16 {

    public static void main(String[] args) {
        int n = 4;
        int[] sumLine = new int[n];
        int countSumLine = 0;
        int[] sumColumn = new int[n];
        int countSumColumn = 0;
        int sumDiagonalLeft = 0;
        int sumDiagonalRight = 0;
        int[][] a = new int[n][n];
        int magicConst = (n * (n * n + 1)) / 2; //Магическая константа нормального волшебного квадрата
        System.out.println("Размер магического квадрата - " + n);
        System.out.println("Магическая константа - " + magicConst);
        while (true) {
            for (int i = 0; i < n.length; i++) { //заполняем матрицу случаными числами
                for (int j = 0; j < n[i].length; j++) {
                    a[i][j] = (int) (random() * ((n * n) + 1)) + 1;
                }
            }
            for (int i = 0; i < sumLine.length; i++) { //сумма чисел в строках
                for (int j = 0; j < a[i].length; j++) {
                    sumLine[i] += a[i][j];
                }
                if (sumLine[i] == magicConst) {
                    countSumLine++;
                }
            }
            for (int i = 0; i < sumColumn.length; i++) { //сумма чисел в столбцах
                for (int j = 0; j < a.length; j++) {
                    sumColumn[i] += a[j][i];
                }
                if (sumColumn[i] == magicConst) {
                    countSumColumn++;
                }
            }
            for (int i = 0; i < a.length; i++) { //сумма чисел в диагонали слева направо
                sumDiagonalLeft += a[i][i];
            }
            for (int i = 0; i < a.length; i++) { //сумма чисел в диагонали справа налево
                sumDiagonalRight += a[i][a.length - 1 - i];
            }
            if (sumDiagonalLeft == magicConst && sumDiagonalRight == magicConst && countSumLine == sumLine.length - 1 && countSumLine == sumColumn.length - 1) {
                break;
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}