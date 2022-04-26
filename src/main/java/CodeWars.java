public class CodeWars {


/**
 * https://www.codewars.com/kata/5601409514fc93442500010b/train/java
 */
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        for (int i = 0; i < classPoints.length; i++) {
            sum += classPoints[i];
        }
        int average = sum / classPoints.length;
        if (yourPoints > average){
            return true;
        } else {
            return false;
        }
    }
    
    public static int[] arraySort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i -1]) {
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                    isSorted = false;
                }
            }
        }

        return array;
    }

    public static <T> boolean equalsArray(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

    }
}