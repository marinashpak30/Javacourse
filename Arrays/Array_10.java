import java.util.Arrays;
public class Array_10 {
        public static void main(String[] args) {
        int[] a = {1, 6, 9, -10, 74, 95, 6, -4, 10, 6, 54};
        for (int i = 1; i < a.length; i += 2) {
            a[i] = 0;
        }
        System.out.println("Каждый второй элемент массива был заменен нулем. Итоговый массив: " + Arrays.toString(a));
    }
}
