package com.alexromanenko;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGeneratorImpl implements PrimeNumberGenerator{


    @Override
    public List<Integer> generate(int start, int end) {

        List<Integer> primeNumbersList = new ArrayList<>();
        int min = Math.min(start, end);
        int max = Math.max(start, end);

        for(int i=min; i<=max; i++) {
            if (isPrime(i))
                primeNumbersList.add(i);
        }

        return primeNumbersList;
    }

    @Override
    public boolean isPrime(int value) {

        if(value <= 1)
            return false;

        for(int i = 2; i <= Math.sqrt(value); i++){

            if(value%i == 0) {
                return false;
            }
        }
        return true;
    }
}
