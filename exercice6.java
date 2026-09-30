package project3;

import java.util.Scanner;

public class exercice6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int MAXV = 100000;

      
        int n = sc.nextInt();
        int k = sc.nextInt();

       
        int[] T = new int[n];

        for (int i = 0; i < n; i++) {
            T[i] = sc.nextInt();
        }

        
        int[] freq = new int[MAXV + 1];

        int distinct = 0;

    
        for (int i = 0; i < k; i++) {

            if (freq[T[i]] == 0) {
                distinct++;
            }

            freq[T[i]]++;
        }

       
        System.out.print(distinct);

      
        for (int i = k; i < n; i++) {

            
            int out = T[i - k];

            freq[out]--;

            if (freq[out] == 0) {
                distinct--;
            }

           
            int in = T[i];

            if (freq[in] == 0) {
                distinct++;
            }

            freq[in]++;

            
            System.out.print(" " + distinct);
        }

        System.out.println();

        sc.close();
    }
}