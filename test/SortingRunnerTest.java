import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jfabiano on 9/27/2016.
 */
public class SortingRunnerTest {

    BaseSorter mySorter = new BubbleSorter();

    private void assertElementOrderDuplicate(int[] numArray) {
        if(numArray.length == 3)
            {
                assertEquals(6, numArray[0]);
                assertEquals(6, numArray[1]);
                assertEquals(19, numArray[2]);
                assertEquals(19, numArray[3]);
                assertEquals(30, numArray[0]);
                assertEquals(47, numArray[1]);
                assertEquals(47, numArray[2]);
                assertEquals(80, numArray[3]);
            }
    }

    private void assertElementOrder(int[] numArray) {

        if(numArray.length == 3)
        {
            assertEquals(5, numArray[0]);
            assertEquals(7, numArray[1]);
            assertEquals(19, numArray[2]);
        }
        else if(numArray.length == 2)
        {
            assertEquals(5, numArray[0]);
            assertEquals(7, numArray[1]);
        }
        else if(numArray.length == 4)
        {
            assertEquals(5, numArray[0]);
            assertEquals(7, numArray[1]);
            assertEquals(19, numArray[2]);
            assertEquals(30, numArray[3]);
        }
    }

    @Test
    public void sortThree() throws Exception {
        int[] orderedArray = {5, 7, 19};
        mySorter.sort(orderedArray);
        assertElementOrder(orderedArray);

        int[] scrambledArray1 = {5, 19, 7};
        mySorter.sort(scrambledArray1);
        assertElementOrder(scrambledArray1);

        int[] scrambledArray2 = {7, 5, 19};
        mySorter.sort(scrambledArray2);
        assertElementOrder(scrambledArray2);

        int[] scrambledArray3 = {7, 19, 5};
        mySorter.sort(scrambledArray3);
        assertElementOrder(scrambledArray3);

        int[] scrambledArray4 = {19, 7, 5};
        mySorter.sort(scrambledArray4);
        assertElementOrder(scrambledArray4);

        int[] scrambledArray5 = {19, 5, 7};
        mySorter.sort(scrambledArray5);
        assertElementOrder(scrambledArray5);
    }
    @Test
    public void sortTwo() throws Exception {
        int[] orderedArray = {5, 7};
        mySorter.sort(orderedArray);
        assertElementOrder(orderedArray);

        int[] scrambledArray1 = {7, 5};
        mySorter.sort(scrambledArray1);
        assertElementOrder(scrambledArray1);

    }
    @Test
    public void sortFour() throws Exception {
        int[] orderedArray = {5, 7, 19, 30};
        mySorter.sort(orderedArray);
        assertElementOrder(orderedArray);

        int[] scrambledArray1 = {5, 7, 30, 19};
        mySorter.sort(scrambledArray1);
        assertElementOrder(scrambledArray1);

        int[] scrambledArray2 = {5, 19, 7, 30};
        mySorter.sort(scrambledArray2);
        assertElementOrder(scrambledArray2);

        int[] scrambledArray3 = {5, 19, 30, 7};
        mySorter.sort(scrambledArray3);
        assertElementOrder(scrambledArray3);

        int[] scrambledArray4 = {5, 30, 7, 19};
        mySorter.sort(scrambledArray4);
        assertElementOrder(scrambledArray4);

        int[] scrambledArray5 = {5, 30, 19, 7};
        mySorter.sort(scrambledArray5);
        assertElementOrder(scrambledArray5);

        int[] scrambledArray6 = {7, 5, 19, 30};
        mySorter.sort(scrambledArray6);
        assertElementOrder(scrambledArray6);

        int[] scrambledArray7 = {7, 5, 30, 19};
        mySorter.sort(scrambledArray7);
        assertElementOrder(scrambledArray7);

        int[] scrambledArray8 = {7, 19, 5, 30};
        mySorter.sort(scrambledArray8);
        assertElementOrder(scrambledArray8);

        int[] scrambledArray9 = {7, 19, 30, 5};
        mySorter.sort(scrambledArray9);
        assertElementOrder(scrambledArray9);

        int[] scrambledArray10 = {7, 30, 5, 19};
        mySorter.sort(scrambledArray10);
        assertElementOrder(scrambledArray10);

        int[] scrambledArray11 = {7, 30, 19, 5};
        mySorter.sort(scrambledArray11);
        assertElementOrder(scrambledArray11);

        int[] scrambledArray12 = {19, 5, 7, 30};
        mySorter.sort(scrambledArray12);
        assertElementOrder(scrambledArray12);

        int[] scrambledArray13 = {19, 5, 30, 7};
        mySorter.sort(scrambledArray13);
        assertElementOrder(scrambledArray13);

        int[] scrambledArray14 = {19, 7, 5, 30};
        mySorter.sort(scrambledArray14);
        assertElementOrder(scrambledArray14);

        int[] scrambledArray15 = {19, 7, 30, 5};
        mySorter.sort(scrambledArray15);
        assertElementOrder(scrambledArray15);

        int[] scrambledArray16 = {19, 30, 5, 7};
        mySorter.sort(scrambledArray16);
        assertElementOrder(scrambledArray16);

        int[] scrambledArray17 = {19, 30, 7, 5};
        mySorter.sort(scrambledArray17);
        assertElementOrder(scrambledArray17);

        int[] scrambledArray18 = {30, 5, 7, 19};
        mySorter.sort(scrambledArray18);
        assertElementOrder(scrambledArray18);

        int[] scrambledArray19 = {30, 5, 19, 7};
        mySorter.sort(scrambledArray19);
        assertElementOrder(scrambledArray19);

        int[] scrambledArray20 = {30, 7, 5, 19};
        mySorter.sort(scrambledArray20);
        assertElementOrder(scrambledArray20);

        int[] scrambledArray21 = {30, 7, 19, 5};
        mySorter.sort(scrambledArray21);
        assertElementOrder(scrambledArray21);

        int[] scrambledArray22 = {30, 19, 5, 7};
        mySorter.sort(scrambledArray22);
        assertElementOrder(scrambledArray22);

        int[] scrambledArray23 = {30, 19, 7, 5};
        mySorter.sort(scrambledArray23);
        assertElementOrder(scrambledArray23);
    }
    @Test
    public void sortDuplicate() throws Exception {
        int[] orderedArray = {6, 6, 19, 19, 30, 47, 47, 80};
        mySorter.sort(orderedArray);
        assertElementOrderDuplicate(orderedArray);

        int[] scrambledArray1 = {6, 19, 30, 19, 47, 47, 80, 6};
        mySorter.sort(scrambledArray1);
        assertElementOrderDuplicate(scrambledArray1);

        int[] scrambledArray2 = {47, 47, 6, 30, 80, 19, 6, 19};
        mySorter.sort(scrambledArray2);
        assertElementOrderDuplicate(scrambledArray2);

        int[] scrambledArray3 = {80, 19, 47, 6, 19, 6, 47, 30};
        mySorter.sort(scrambledArray3);
        assertElementOrderDuplicate(scrambledArray3);

        int[] scrambledArray4 = {80, 47, 47, 6, 19, 6, 30, 19};
        mySorter.sort(scrambledArray4);
        assertElementOrderDuplicate(scrambledArray4);

        int[] scrambledArray5 = {6, 19, 80, 19, 47, 6, 30, 47};
        mySorter.sort(scrambledArray5);
        assertElementOrderDuplicate(scrambledArray5);

        int[] scrambledArray6 = {19, 19, 80, 47, 47, 30, 6, 6};
        mySorter.sort(scrambledArray6);
        assertElementOrderDuplicate(scrambledArray6);

        int[] scrambledArray7 = {47, 6, 47, 19, 30, 19, 6, 80};
        mySorter.sort(scrambledArray7);
        assertElementOrderDuplicate(scrambledArray7);

        int[] scrambledArray8 = {19, 47, 47, 30, 6, 80, 6, 19};
        mySorter.sort(scrambledArray8);
        assertElementOrderDuplicate(scrambledArray8);

        int[] scrambledArray9 = {47, 30, 6, 19, 19, 80, 47, 6};
        mySorter.sort(scrambledArray9);
        assertElementOrderDuplicate(scrambledArray9);

        int[] scrambledArray10 = {6, 47, 30, 80, 47, 19, 6, 19};
        mySorter.sort(scrambledArray10);
        assertElementOrderDuplicate(scrambledArray10);

        int[] scrambledArray11 = {30, 47, 80, 19, 6, 19, 6, 47};
        mySorter.sort(scrambledArray11);
        assertElementOrderDuplicate(scrambledArray11);
    }
}