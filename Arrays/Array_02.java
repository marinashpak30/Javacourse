import java.util.Arrays;

public class Array_02 {

    public static void main(String[] args) {
        int num = 2;
        int[] a = {2, -2, 9, 7, -1, 0, 5, 10};
        replacement(a, num);
    }

    public static void replacement(int[] array, int num) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > num) {
                array[i] = num;
                k++;
            }
        }
        System.out.println("В массиве a[n] все числа, больше Z = " + num + " были замененны этим числом. \n" +
                "Результатом замены стал новый массив: " + Arrays.toString(array) + ". Количество замен = " + k + ".");
    }
}

