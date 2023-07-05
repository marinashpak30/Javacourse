public class Array_array_06 {

    public static void main(String[] args) {
        int n = 6; //порядок квадратной матрицы - четное число!
        int[][] a = new int[n][n];
        //вывод первой половины матрицы
        for (int i = 0; i < a.length/2; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(j >= i && j < a[i].length - i) {
                    System.out.print((a[i][j] = 1) + " ");
                } else {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
        //вывод второй половины матрицы
        for (int i = a.length/2; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(j <= i && j >= a[i].length - 1 - i) {
                    System.out.print((a[i][j] = 1) + " ");
                } else {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
