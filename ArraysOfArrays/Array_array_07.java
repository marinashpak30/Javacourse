import static java.lang.Math.*;

public class Array_array_07 {

    public static void main(String[] args) {
        int n = 6; //порядок квадратной матрицы - четное число!
        double[][] a = new double[n][n];
        int k=0;

        //вывод первой половины матрицы
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sin((pow(i,2)-pow(j,2))/n);
                System.out.printf("%.3f ", a[i][j]  );

                if(a[i][j] >= 0 ){
                    k++;
                }
            }
            System.out.println();
        }

        System.out.println("Кол-во положительных чисел    =" + k );
    }
}
