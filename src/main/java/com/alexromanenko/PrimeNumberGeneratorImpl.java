package com.alexromanenko;

import java.util.List;

public class PrimeNumberGeneratorImpl implements PrimeNumberGenerator{


    @Override
    public List<Integer> generate(int startingValue, int endingValue) {
        return null;
    }

    @Override
    public boolean isPrime(int value) {

        if(value < 1)
            return false;

        for(int i = 2; i <= Math.sqrt(value); i++){

            if(value%i == 0) {
                return false;
            }
        }
        return true;
    }
}
