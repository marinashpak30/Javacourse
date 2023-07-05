import java.util.Arrays;

public class Array_05 {

    public static void main(String[] args) {
        int[] a = {2, -2, 9, 7, -1, 0, 5, 10};
        System.out.println("Вывод чисел, удовлетворяющих условию a[i] > i:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] > i) {
                System.out.print(a[i] + "   ");
            }
        }
    }
}
