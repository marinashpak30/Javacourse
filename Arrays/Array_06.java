public class Array_06 {

    public static void main(String[] args) {
        int[] a = {2, -2, 9, 7, -1, 0, 5, 10};
        int sum = a[1] + a[2]; //т.к. счет в массиве идет от 0, a 0 не является простым числом
        for (int i = 3; i < a.length; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                } else {
                    sum += a[i];
                }
            }
        }
        System.out.println("Сумма элементов массива, порядковые номера которых являются простыми числами, равна = " + sum);
    }
}
