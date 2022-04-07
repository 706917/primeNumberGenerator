package com.alexromanenko;
import com.alexromanenko.PrimeNumberGenerator;

public class Application {
    static PrimeNumberGenerator primeNumberGenerator;

    public static void main(String[] args) {

        primeNumberGenerator = new PrimeNumberGeneratorImpl();

        System.out.println(primeNumberGenerator.isPrime(1));
    }

}
