import java.util.Scanner;

public class Array_01 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int K = 2;
        int [] A ={1,2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum=0;
        for (int i=0; i<A.length;i++){
            if(A[i]%K==0)
            { sum+=A[i]; }
        }
        System.out.println("сумма элементов кратных 'K' равна  " + sum);
    }
}
