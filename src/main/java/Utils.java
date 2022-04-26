
import org.apache.commons.lang3.StringUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Random;

public class Utils {

    public static class _Random {

        public static int getRandomInt(int origin, int bound) {
            return new Random().nextInt(origin, bound);
        }

        public static double getRandomDouble(double origin, double bound) {
            return new Random().nextDouble(origin, bound);
        }
    }

    public static class _DateAndTime {

        public static String getCurrentDateTime() {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm:ss");
            return dtf.format(LocalDateTime.now());
        }
    }

    private static String getFilePath() {
        File file = new File("src/main/resources/");
        return file.getAbsolutePath();
    }

    private static BufferedImage grabScreen() {
        try {
            return new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        } catch (SecurityException | AWTException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void screenShot() {
        try {
            ImageIO.write(Objects.requireNonNull(grabScreen()), "jpg",
                    new File(getFilePath(), "screen.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void print(String str) {
        System.out.println(str);
    }

    public static String[] strToArray (String str) {
        return StringUtils.split(str);
    }
}