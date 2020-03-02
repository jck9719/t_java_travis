import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;


import static org.junit.Assert.*;

public class FizzBuzzTest {

    FizzBuzz temp;

    @Before
    public void setUp(){
        temp = new FizzBuzz();
    }

    @Test
    public void trivialTest() {
        assertTrue(true);
    }

    @Test
    public void test_fizz_method(){
        Assert.assertEquals("Fizz",temp.print(9));
    }

    @Test
    public void test_buzz_method(){
        Assert.assertEquals("Buzz",temp.print(20));
    }

    @Test
    public void test_fizz_buzz_method(){
        Assert.assertEquals("FizzBuzz", temp.print(30));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_exception_fizz_buzz(){
        Assert.assertEquals("FizzBuzz", temp.print(-15));
    }

    @Test
    public void test_check_if_prime_method(){
        assertTrue(temp.checkIfPrime(13));
    }

    @Test
    public void test_double_equal_method(){
        Assert.assertEquals(158.12345, temp.doubleEquals(158.12345), 5);

    }

    @Test
    public void test_are_you_an_alien_method(){
        assertFalse(temp.areYouAnAlien("No"));

    }

    @Test
    public void test_is_not_null_method(){
        assertNotNull(temp.isNotNull());
    }

    @Test
    public void test_is_null_method(){
        assertNull(temp.isNull());
    }

    @After
    public void teardown(){
        temp = null;
    }

}