package com.week25.challenges;

import java.util.*;

/**
 * Created by shivendrasrivastava on 11/2/16.
 */
public class BetweenTwoSets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }

        int start = a[a.length-1];
        int end = b[b.length-1];

        Set<Integer> result = new HashSet<>();
        boolean isAFactor = true;
        for (int j=0; j<a.length; j++)
        {
            if (start % a[j] != 0)
            {
                isAFactor = false;
            }
        }

        if (isAFactor)
        {
            result.add(start);

            for (int i=start; i<=end; i++)
            {
                boolean isAFactorB = true;
                int factor = i;
                for (int k=0; k<b.length; k++)
                {
                    if (b[k]%i != 0 )
                    {
                        isAFactorB = false;
                    }

                }
                if (factor != 0 && isAFactorB)
                {
                    result.add(factor);
                }
            }
        }



        System.out.println(result.size());
    }
}
