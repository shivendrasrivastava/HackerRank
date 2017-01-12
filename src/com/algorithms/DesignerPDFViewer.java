package com.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by shivendrasrivastava on 11/24/16.
 */
public class DesignerPDFViewer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();

        Map<Character, Integer> alphabetMap = new HashMap<Character, Integer>();

        Character[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (int i=0; i<letters.length; i++)
        {
            alphabetMap.put(letters[i], h[i]);
        }

        char[] wordArray = word.toCharArray();

        int[] heights = new int[wordArray.length];

        for (int j = 0; j<wordArray.length; j++)
        {
            heights[j] = alphabetMap.get(wordArray[j]);
        }

        Arrays.sort(heights, 0, heights.length);

        int max = heights[heights.length-1];

        int area = wordArray.length * max;

        System.out.print(area);


    }
}
