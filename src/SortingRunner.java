import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

/**
 * Created by jfabiano on 9/27/2016.
 */
public class SortingRunner {

    public static void main(String[] args) {
        System.out.println("Running ...");
        SortingRunner myRunner = new SortingRunner();

        int[] orderedArray = {7, 5, 30, 19, 1, 2, 3, 60};
        myRunner.selectionSort(orderedArray);
    }

    public void bubbleSort(int[] arrayToSort) {
        int initialMax = arrayToSort.length;
        for (int currentMax = initialMax; currentMax >= 0; currentMax--) {
            for (int counter = 0; counter < currentMax - 1; counter++) {
                if (arrayToSort[counter] > arrayToSort[counter + 1]) {
                    swapNumbers(counter, counter + 1, arrayToSort);
                }
            }
            printNumbers(arrayToSort);
        }
    }
    public void selectionSort(int[] arrayToSort) {

        for (int sortStartPoint = 0; sortStartPoint < arrayToSort.length; sortStartPoint++) {
            int lowestNumberIndex = sortStartPoint;
            for(int counter = sortStartPoint + 1; counter < arrayToSort.length; counter++) {

                if (arrayToSort[counter] < arrayToSort[lowestNumberIndex]) {
                    lowestNumberIndex = counter;
                }
            }
            swapNumbers(sortStartPoint, lowestNumberIndex, arrayToSort);
            printNumbers(arrayToSort);
        }
    }
    private void swapNumbers(int firstIndex, int secondIndex, int[] intArray) {
        int firstNumber = intArray[firstIndex];
        intArray[firstIndex] = intArray[secondIndex];
        intArray[secondIndex] = firstNumber;
    }

    private void printNumbers(int[] numbers) {
        for (int counter = 0; counter < numbers.length; counter++) {
            System.out.print(numbers[counter] + " ");
        }
        System.out.println();
    }


}
