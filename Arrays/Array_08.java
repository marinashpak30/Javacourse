import java.util.Arrays;
public class Array_08 {

    public static void main(String[] args) {
        int[] a = {2, -2, 9, 7, -1, 0, 5, 10}; //массив

        int imin = 0; //начальный индекс минимального числа
        int min = a[0]; //максимальное число для определения минимального
        int[] amin = new int[a.length - 1];

        //находим минимальное число массива array и его индекс
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                imin = i;
            }
        }
        //заполняем массив amin
        //копируем элементы из a до индекса imin в amin
        // System.arraycopy(a, 0, amin, 0, imin);
        //копируем элементы из array после индекса imin в amin
        // System.arraycopy(array, (iMin + 1), arrayMin, iMin, (amin.length - imin));
        for (int i = 0; i < a.length - 1; i++) {
            if (i < imin) {
                amin[i] = a[i];
            } else {
                amin[i] = a[i + 1];
            }
        }
        System.out.println("Исходный массив:" + Arrays.toString(a));
        System.out.println("Исключаемое минимальное число: " + min);
        System.out.println("Новый массив: " + Arrays.toString(amin));
    }
}
