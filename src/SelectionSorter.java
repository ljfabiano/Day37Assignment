/**
 * Created by jfabiano on 9/27/2016.
 */
public class SelectionSorter extends BaseSorter{

//    public void sort(){
//
//    }

    public void sort(int[] arrayToSort) {

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

}
