package com.algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by shivendrasrivastava on 11/23/16.
 */
public class MiniMaxSum {

    public static void main(String[] args)
    {
        MiniMaxSum miniMax = new MiniMaxSum();
        miniMax.miniMaxSum();
    }

    public long[] miniMaxSum()
    {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();

        List<Long> numbers = Arrays.asList(a, b, c, d, e);

        Collections.sort(numbers);

        Long sum = numbers.stream().mapToLong(i -> i.longValue()).sum();

        Long greatestSum = sum - numbers.get(0);

        Long leastSum = sum - numbers.get(numbers.size()-1);

        System.out.print(leastSum +" "+ greatestSum);

        long[] result = {leastSum, greatestSum};

        return result;
    }
}
