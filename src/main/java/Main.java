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

        //Сраниваем массивы
        Integer[] intArr1 = {1, 2, 3, 4, 5, 6, 7};
        Integer[] intArr2 = {1, 2, 3, 4, 4, 6, 7};

        String[] strArray1 = {"A", "a", "B", "b", "Z", "z"};
        String[] strArray2 = {"A", "a", "B", "c", "Z", "z"};

        boolean result = CodeWars.equalsArray(intArr1, intArr2);
        System.out.println(result);
        boolean result2 = CodeWars.equalsArray(strArray1, strArray2);
        System.out.println(result2);

        //Сортировка массива
        int[] sortArr = {12, 2, -1};
        System.out.println(Arrays.toString(CodeWars.arraySort(sortArr)));

    }
}