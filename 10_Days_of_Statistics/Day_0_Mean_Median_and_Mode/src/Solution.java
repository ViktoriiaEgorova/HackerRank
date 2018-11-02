import java.io.*;
import java.util.*;

public class Solution {

    public static double Moda(int[] ar){
        int n = ar.length;
        int tmax = ar[0];
        int nmax = 0;
        for (int i=0; i<n; i++){
            int t = ar[i];
            int nt = 0;
            for (int j=0; j<n; j++){
                if (ar[j]==t){
                    nt++;
                }
                if (nt>nmax){
                    tmax = t;
                    nmax = nt;
                }
                else
                if (nt == nmax){
                    if (nmax>nt){
                        nmax = nt;
                    }
                }
            }
        }
        return tmax;
    }


    public static double Median(int[] ar){
        int n = ar.length - 1;
        for(int i = ar.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( ar[j] > ar[j+1] ){
                    int tmp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = tmp;
                }
            }
        }
        if ((n%2) == 0) {
            return (double)ar[n/2];
        }
        else {
            return (double)(ar[(n+1)/2 -1]+ar[(n+1)/2])/2;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        double sum = 0;
        for (int i=0; i<n; i++){
            ar[i] = in.nextInt();
            sum = sum + ar[i];
        }
        System.out.println((double)sum/n);
        System.out.println(Median(ar));
        System.out.println(Moda(ar));
    }
}