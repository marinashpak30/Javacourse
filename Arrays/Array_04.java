import java.util.Arrays;
public class Array_04 {
    public static void main(String[] args) {

        int[] a = {2, -2, 9, 7, -1, 0, 5, 10};

        int max = a[0];
        int min = a[0];

        int imax = 0;
        int imin = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                imax = i;
            }
            if (a[i] < min) {
                min= a[i];
                imin =i;
            }
        }
        //меняет местами максимальное с минимальным значением
        int k = a[imax];
        a[imax] = a[imin];
        a[imin] = k;
        System.out.println("Результат : " + Arrays.toString(a) );
    }
}
