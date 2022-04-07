import com.alexromanenko.PrimeNumberGeneratorImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PrimeNumberGeneratorTests {

    @InjectMocks
    private PrimeNumberGeneratorImpl underTest;

    @Test
    public void testIsPrimeForTrueWithPrimeNumber(){
        int realPrimeNumber = 1;
        Assert.assertTrue(underTest.isPrime(realPrimeNumber));
    }

    @Test
    public void testIsPrimeForFalseWithNotPrimeNumber(){
        int notPrimeNumber = 2;
        Assert.assertFalse(underTest.isPrime(notPrimeNumber));
    }

    @Test
    public void testIsPrimeForFalseWithZeroOrNegativeNumber(){
        int zeroNumber = 0;
        int negativeNumber = -1;
        Assert.assertFalse(underTest.isPrime(zeroNumber));
        Assert.assertFalse(underTest.isPrime(negativeNumber));
    }
}
