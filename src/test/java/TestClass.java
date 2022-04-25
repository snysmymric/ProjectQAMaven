import org.testng.Assert;
import org.testng.annotations.Test;


public class TestClass {
    @Test
    public static void testBetterThanAverage1() {
        boolean actualResult =
                CodeWars.betterThanAverage(new int[]{2,3}, 5);
        Assert.assertEquals(actualResult,true);

    }

    @Test
    public static void testBetterThanAverage2() {
        boolean actualResult =
                CodeWars.betterThanAverage(new int[]
                        {100, 40, 34, 57, 29, 72, 57, 88}, 75);
        Assert.assertEquals(actualResult, true);
    }

    @Test
    public static void testBetterThanAverage3() {
        boolean actualResult =
                CodeWars.betterThanAverage(new int[]
                        {12, 23, 34, 45, 56, 67, 78, 89, 90}, 69);
        Assert.assertEquals(actualResult, true, "Pass");
    }

    @Test
    public static void testBetterThanAverage4() {
        boolean actualResult =
                CodeWars.betterThanAverage(new int[]{100, 90}, 11);
        Assert.assertEquals(actualResult, false, "НЕ ПРОШЛА ПРОВЕРКА");
    }
}