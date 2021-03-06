import com.alexromanenko.PrimeNumberGeneratorImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;

@RunWith(MockitoJUnitRunner.class)
public class PrimeNumberGeneratorTests {

    @InjectMocks
    private PrimeNumberGeneratorImpl underTest;

    @Test
    public void testIsPrimeForTrueWithPrimeNumber(){
        // this array can be initialized outside this method
        int[] primeNumbersArray = new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
        for(int num : primeNumbersArray)
        Assert.assertEquals("Value in the array with the failed assertion: " + num,true, underTest.isPrime(num));
    }

    @Test
    public void testIsPrimeForFalseWithNotPrimeNumber(){
        int[] notPrimeNumbersArray = new int[]{4,6,8,9,10,12,14,15,16,18,20,21,22,24,25,26,28,30,32};
        for(int num : notPrimeNumbersArray)
            Assert.assertEquals("Value in the array with the failed assertion: " + num,false, underTest.isPrime(num));
    }

    @Test
    public void testIsPrimeForFalseWithZeroOrNegativeNumber(){
        int[] notPrimeNumbersArray = new int[]{0,1,-8,-9,-10,-12,-2,-3,-5,-7,-11,-13,-17,-19};
        for(int num : notPrimeNumbersArray)
            Assert.assertEquals("Value in the array with the failed assertion: " + num,false, underTest.isPrime(num));
    }

    @Test
    public void testGenerateForNotNULL() {
        int start = 2;
        int end = 10;
        Assert.assertNotNull(underTest.generate(start, end));
    }

    @Test
    public void testGenerateForListType() {
        int start = 2;
        int end = 10;
        Assert.assertThat(underTest.generate(start, end), instanceOf(List.class));
    }

    @Test
    public void testGenerateForPrimeNumbersList(){
        // this List can be initialized outside this method
        List<Integer> primeNumbersList = new ArrayList<>(List.of(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101));
        int start = -20;
        int end = 102;
        Assert.assertEquals(primeNumbersList, underTest.generate(start, end));
    }

    @Test
    public void testGenerateForPrimeNumbersListWithReversedParameters(){
        // this List can be initialized outside this method
        List<Integer> primeNumbersList = new ArrayList<>(List.of(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101));
        int start = 102;
        int end = -20;
        Assert.assertEquals(primeNumbersList, underTest.generate(start, end));
    }

    @Test
    public void testGenerateForPrimeNumbersListWithNegativeParameters(){
        // this List can be initialized outside this method
        List<Integer> primeNumbersList = new ArrayList<>(List.of(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101));
        int start = -102;
        int end = -20;
        Assert.assertEquals(0, underTest.generate(start, end).size());
    }


}
