import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.Test;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UtilsTest {
    @Test
    public void testStrToArray1() {

        String[] result = Utils.strToArray("I love java");
        String[] expected = new String[]{"I","love","java"};
        Assert.assertEquals(result,expected);
    }
    @Test
    public void testStrToArray2() {

        String[] result = Utils.strToArray("");
        String[] expected = new String[]{};
        Assert.assertEquals(result,expected);
    }
    @Test
    public void testStrToArray3() {

        String[] result = Utils.strToArray("I LOVE JAVA");
        String[] expected = new String[]{"I","LOVE","JAVA"};
        Assert.assertEquals(result,expected);
    }
    @Test
    public void testScreenShot() {
        Utils.screenShot();
        boolean result = Files.exists(Path.of("./src/main/resources/screen" +
                ".jpg"));
        boolean expected = true;
        Assert.assertEquals(result,expected);
    }
}
