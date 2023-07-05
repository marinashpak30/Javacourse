import java.util.Arrays;

public class Array_03 {

    public static void main(String[] args) {
        int num = 2;
        int[] a = {2, -2, 9, 7, -1, 0, 5, 10};

        int k1 = 0;
        int k2 = 0;
        int k3 = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0){
                if (a[i] < 0) {
                    k1++;}
                if (a[i] > 0){
                    k2++;}
            }else{
                k3++; }
        }
        System.out.println("Кол-во < 0 : " + k1 +
                " Кол-во > 0  :  \n" +k2+
                "Кол-во = 0  : " + k3);
    }
}

