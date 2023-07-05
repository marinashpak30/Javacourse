import java.util.Arrays;
public class Array_07 {

        public static void main(String[] args) throws Exception {

            int[] a = {2, -2, 9, 7, -1, 0, 5, 10}; //массив

            int max = Integer.MIN_VALUE; //минимальное число для определения максимального
            //заполняем массив array числами типа int

            //находим max суммы чисел согласно условию
            for (int i = 0; i < a.length; i++) {
                if (i < a.length / 2) {//проверку осуществляем только до серидины массива, дальше будет повторение
                    //условие: сумма первого и последнего элемента массива, затем второго и предпоследнего и т.д.
                    if ((a[i] + a[a.length - 1 - i]) > max) {
                        max = a[i] + a[(a.length - 1 - i)];
                    }
                } else break;
            }
            System.out.println("Исходный массив a[" + a.length + "]: " + Arrays.toString(a));
            System.out.println("Максимальная сумма согласно условию max = " + max);
        }
    }