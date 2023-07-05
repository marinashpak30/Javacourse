public class Array_09 {

    public static void main(String[] args) {
        int[] a = {5, 2, 5, 5, 2, 6, 6, 6, 8, 7, 2, 2, 5, 5, 4, 6, 3, 6, 7}; //массив
        int k = 0; //число совпадений
        int kmax = 0; //начальное число максимальных воспадений
        int imin = 0;
        int num = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] == a[j]) { //ищем одинаковые числа и фиксируем количество совпадений
                    k++;
                }
            }
            if (k >= kmax) { //сравниваем количество совпадений
                if (k > kmax) {
                    imin = i;
                } else {
                    imin = (a[i] < a[imin]) ? i : imin;//при равенстве совпадений, ищем индекс минимального числа
                }
                num = a[imin];
                kmax = k;
            }
            k = 0; // обнуляем счетчик для сравнения следующиего числа
        }
        System.out.println("Искомое число = " + num + ", количество совпадений = " + kmax);
    }

}
