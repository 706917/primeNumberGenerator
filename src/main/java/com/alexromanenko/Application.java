package com.alexromanenko;

public class Application {

    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("Please enter exact two parameters");
            System.exit(0);
        }

        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);


        if(start < 0  && end <0){
            System.out.println("At least one of your parameters should be a positive number");
            System.exit(0);
        }

        System.out.println(new PrimeNumberGeneratorImpl().generate(start, end));
    }

}
