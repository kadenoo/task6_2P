package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {

    @Test
    public void testStudentIdentity() {
        String studentId = "s222448654";
        Assert.assertNotNull("Student ID is null", studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "Rachel Moraa";
        Assert.assertNotNull("Student name is null", studentName);
    }

    @Test
    public void testIsEven() {
        // Test even numbers
        Assert.assertTrue(WeatherAndMathUtils.isEven(2));
        Assert.assertTrue(WeatherAndMathUtils.isEven(10));
        // Test odd numbers
        Assert.assertFalse(WeatherAndMathUtils.isEven(3));
        Assert.assertFalse(WeatherAndMathUtils.isEven(11));
    }

    @Test
    public void testIsPrime() {
        // Test prime numbers
        Assert.assertTrue(WeatherAndMathUtils.isPrime(2));
        Assert.assertTrue(WeatherAndMathUtils.isPrime(5));
        Assert.assertTrue(WeatherAndMathUtils.isPrime(7));
        // Test non-prime numbers
        Assert.assertFalse(WeatherAndMathUtils.isPrime(1));
        Assert.assertFalse(WeatherAndMathUtils.isPrime(4));
        Assert.assertFalse(WeatherAndMathUtils.isPrime(8));
    }

    @Test
    public void testCancelWeatherAdvice() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }

    @Test
    public void testWarnWeatherAdvice() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(50.0, 4.1));
    }

    @Test
    public void testAllClearWeatherAdvice() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(30.0, 3.0));
    }
}
