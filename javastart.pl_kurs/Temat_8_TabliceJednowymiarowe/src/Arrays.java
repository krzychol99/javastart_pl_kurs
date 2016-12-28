/**
 * Created by krzychol99 on 2016-12-28.
 */
public class Arrays {
    public static void main(String[] args) {
        int[] firstArray = new int[3];
        firstArray[0] = 2;
        firstArray[1] = 4;
        firstArray[2] = 6;
        int arrayFirstLenght = firstArray.length;

        int[] secondArray = new int[3];
        secondArray[0] = 1;
        secondArray[1] = 3;
        secondArray[2] = 5;
        int arraySecondLenght = secondArray.length;

        ArraySum arraySum = new ArraySum();

        System.out.println(arraySum.sumArrays(firstArray, secondArray));
    }
}
