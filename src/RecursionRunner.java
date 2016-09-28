import java.util.HashMap;

/**
 * Created by jfabiano on 9/27/2016.
 */
public class RecursionRunner {
    int fibCount = 0;
    long[] arrayOfFibNums;
    public static void main(String[] args) {
        System.out.println("Running ...");
        RecursionRunner runner = new RecursionRunner();
        runner.recursionTest(0, 25);
        int myFactInt = runner.factorialRecursionTest(5);
        System.out.println("myFactInt = " + myFactInt);
        long answer = runner.fibSimple(10);
        System.out.println("answer = " + answer);
        System.out.println("fibCount = " + runner.fibCount);
        runner.fibCount = 0;

        runner.arrayOfFibNums = new long[10];
        long answerEfficient = runner.fibEfficient(runner.arrayOfFibNums, 9);
        System.out.println("answerEfficient = " + answerEfficient);
        System.out.println("fibCount = " + runner.fibCount);

        runner.fibCount = 0;

        long answerRealEfficient = runner.fibSimpleAfterClass(10);
        System.out.println("invoked " + runner.fibCount + " times.");
        System.out.println("answer for real deal = " + answerRealEfficient);
    }

    public int recursionTest(int count, int max) {
        System.out.print(count + " ");
        if (count >= max) {
            System.out.println();
            return count;
        }
        return recursionTest(count+1, max);
    }
    //Implement factorial using recursion
    public int factorialRecursionTest(int max) {
        System.out.print(max + " ");
        if (max == 2) {
            System.out.println();
            return max;
        }
        return factorialRecursionTest(max-1) * max;
    }
    public long fibSimple(long fibNum)
    {
        fibCount++;
        System.out.print(fibNum + " ");
        if(fibNum == 0 || fibNum == 1)
        {
            System.out.println();
            return fibNum;
        }

        return fibSimple(fibNum - 1) + fibSimple(fibNum - 2);
    }
    public long fibEfficient(long[] arrayOfFibNums, long fibNum)
    {

        fibCount++;
        System.out.print(arrayOfFibNums[(int)fibNum] + " ");
        arrayOfFibNums[0] = 0;
        arrayOfFibNums[1] = 1;
        if(fibNum == 0 || fibNum == 1)
        {
            System.out.println();

            return fibNum;
        }
//        if(arrayOfFibNums[0] == 0 && arrayOfFibNums[1] == 1) {
//            arrayOfFibNums[(int)fibNum] = arrayOfFibNums[(int)fibNum - 1] + arrayOfFibNums[(int)fibNum - 2];
//            return fibEfficient(arrayOfFibNums[(int)fibNum - 1] + arrayOfFibNums[(int)fibNum - 2]);
//        }
        //arrayOfFibNums[1] = 1;
        //return fibSimple(fibNum - 1) + fibSimple(fibNum - 2);
        arrayOfFibNums[(int)fibNum] = arrayOfFibNums[(int)fibNum - 1] + arrayOfFibNums[(int)fibNum - 2];
            return fibEfficient(arrayOfFibNums, fibNum - 1) + arrayOfFibNums[(int)fibNum -2];
    }
    static HashMap<Long, Long> cachedFibs = new HashMap<>();
    public long fibSimpleAfterClass(long fibNum)
    {
        fibCount++;
        System.out.print(fibNum + " ");
        if(fibNum == 0 || fibNum == 1)
        {
            System.out.println();
            cachedFibs.put(fibNum, fibNum);
            return fibNum;
        }
        Long fibNumMinus1 = cachedFibs.get(new Long(fibNum - 1));
        if (fibNumMinus1 == null)
        {
            fibNumMinus1 = fibSimpleAfterClass(fibNum - 1);
        }
        else
        {
            fibCount++;
        }
        Long fibNumMinus2 = cachedFibs.get(new Long(fibNum - 2));
        if (fibNumMinus2 == null)
        {
            fibNumMinus2 = fibSimpleAfterClass(fibNum - 2);
        }
        else
        {
            fibCount++;
        }
cachedFibs.put(fibNum, fibNumMinus1 + fibNumMinus2);
        return fibNumMinus1 + fibNumMinus2;
    }
}
