/**
 * Created by jfabiano on 9/27/2016.
 */
public abstract class BaseSorter implements TiySortingInterface{

    protected void swapNumbers(int firstIndex, int secondIndex, int[] intArray) {
        int firstNumber = intArray[firstIndex];
        intArray[firstIndex] = intArray[secondIndex];
        intArray[secondIndex] = firstNumber;
    }

    protected void printNumbers(int[] numbers) {
        for (int counter = 0; counter < numbers.length; counter++) {
            System.out.print(numbers[counter] + " ");
        }
        System.out.println();
    }

}
