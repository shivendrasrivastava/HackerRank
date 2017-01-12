package com.algorithms;

import java.math.BigInteger;

/**
 * Created by shivendrasrivastava on 1/12/17.
 */
public class UniqueKeyGen {


    public void generateKeys(long sequence)
    {
        BigInteger large_64_bit_num = BigInteger.valueOf(Long.MAX_VALUE).subtract(BigInteger.valueOf(10000000000000l));
        //System.out.println("Start Value "+ large_64_bit_num);
        long currentTime = System.currentTimeMillis() + sequence;
        //System.out.println(currentTime);
        large_64_bit_num = large_64_bit_num.add(BigInteger.valueOf(currentTime));

        if(large_64_bit_num.longValueExact() > Long.MAX_VALUE || large_64_bit_num.longValueExact() < Long.MIN_VALUE)
        {
            System.out.println("Error this is not what we wanted "+large_64_bit_num);
        }

        System.out.println("The Key is "+large_64_bit_num);

    }

    public static void main(String[] args)
    {
        UniqueKeyGen uniqueKeyGen = new UniqueKeyGen();
        System.out.println(Long.MIN_VALUE);
        for (int i=0; i<100; i++)
        {

            uniqueKeyGen.generateKeys(i);
        }


    }

}
