# primeNumberGenerator
 test project for Updox

## Commit 1
  - base structure
  - first set of tests for isPrime(int num) method
  - one test is failing:
    - testIsPrimeForTrueWithPrimeNumber()
  - two passed tests considered as false positive
    
## Commit 2
  - implementation to pass test testIsPrimeForTrueWithPrimeNumber()
  - one tests from the first set is failing now:
    - testIsPrimeForFalseWithZeroOrNegativeNumber()
  - two passed tests considered as true positive

## Commit 3
  - implementation to pass all three tests from the first set of tests
  - all three tests considered having true positive pass

## Commit 4
   - first set of tests improved, that allowed to find a bug in implementation. Bug fixed
   - all three tests considered having confirmed true positive pass

##Commit 5
   - second set of tests for generate(int start, int end) method
   - all three tests are failing

##Commit 6
   - first implementation to pass second set of tests
   - all three tests considered having true positive pass

##Commit 7
   - two more tests for generate($params) method
   - one of them is failing -> testGenerateForPrimeNumbersListWithReversedParameters()

## Commit 8
   - implementation to pass new tests
   - both new tests considered having true positive pass

## Commit 9
   - Driver class to use program in command line
