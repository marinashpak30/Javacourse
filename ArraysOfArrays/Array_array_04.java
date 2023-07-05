public class Array_array_04 {

    public static void main(String[] args) {
        int n = 6; //порядок квадратной матрицы - четное число!
        int[][] a = new int[n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(i % 2 !=0 ){
                    System.out.print((a[i][j] = (n - j)) + " ");//вывод четной строки
                } else {
                    System.out.print((a[i][j] = (j + 1)) + " ");//вывод нечетной строки
                }
            }
            System.out.println();
        }
    }
}
