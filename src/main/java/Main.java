import org.apache.commons.lang3.StringUtils;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Example
        BoxWithNumbers<Integer> intBox1 = new BoxWithNumbers<>(1, 2, 3, 4, 5);
        BoxWithNumbers<Integer> intBox2 = new BoxWithNumbers<>(1, 2, 3, 4, 5);
        BoxWithNumbers<Float> floatBox1 = new BoxWithNumbers<>(1f, 2f, 3f, 4f, 5f);
        BoxWithNumbers<Float> floatBox2 = new BoxWithNumbers<>(1f, 2f, 3f, 4f, 5f);

        //Сравниваем коробки extends Number
        System.out.println(intBox1.compareAverage(intBox2));
        System.out.println(floatBox1.compareAverage(floatBox2));

        //Сравниваем объекты разных типов
        System.out.println(intBox1.compareAverage(floatBox1));

        //Возвращает текующую дату
        System.out.println(Utils._DateAndTime.getCurrentDateTime());

        //Делаем скрин экрана, файл сохраняется в "src/main/resources/"
        Utils.screenShot();
    }
}