import static java.lang.Math.random;

public class Array_array_14 {

    public static void main(String[] args) {
        int n = 5;//строки
        int m = 6;//столбцы
        // количество строк должно быть больше или равно, чем количество стобцов, минус 1
        int[][] a = n >= m - 1 ? new int[n][m] : new int[m][n];
        int[] count = n >= m - 1 ? new int[m] : new int[n]; //счетчик столбцов
        int countOne = 0; //счетчик единиц
        for (int i = 0; i < count.length; i++) {
            count[i] = i;
        }
        //исходная матрица по умолчанию заполнена нулями
        //заполняем матрицу недостающими единицами согласно условию задачи
        for (int i = 0; i < count.length; i++) { //перебираем номера столбцов по порядку
            while (true) {
                if (countOne == count[i]) break; //если кол-во 1 равно номеру столбца, то выходим из цикла
                int j = (int) (random() * (a.length)); //случайный индекс строки
                if (a[j][i] == 0) {
                    a[j][i] = 1;
                    countOne++;
                }
            }
            countOne = 0;
        }
        System.out.println("Матрица из 0 и 1:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
