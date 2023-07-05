public class Array_Array_05 {

    public static void main(String[] args) {
        int n = 6; //порядок квадратной матрицы - четное число!
        int[][] a = new int[n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = a[i].length - 1; j >= 0; j--) {
                if (i <= j) {
                    System.out.print((a[i][j] = (i + 1)) + " ");
                } else {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
