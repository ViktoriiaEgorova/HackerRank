import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int s1=0; int s2=0;
        int[] x = new int[N];
        int[] w = new int[N];
        for (int i=0; i<N; i++){
            x[i] = in.nextInt();
        }
        for (int i=0; i<N; i++){
            w[i] = in.nextInt();
        }

        for (int i=0; i<N; i++){
            s1 = s1+x[i]*w[i];
            s2 = s2+w[i];
        }

        System.out.printf("%.1f", (double) s1/s2);

    }
}