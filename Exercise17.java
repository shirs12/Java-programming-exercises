public class Exercise17 {
    /*
    https://edabit.com/challenge/uqZD99bDGx3LnSv6w

    Recursion: Inclusive Array Ranges

    Write a function that,
    given the start startNum and end endNum values,
    return an array containing all the numbers inclusive to that range.

    Examples
    inclusiveArray(1, 5) ➞ [1, 2, 3, 4, 5]
    inclusiveArray(2, 8) ➞ [2, 3, 4, 5, 6, 7, 8]
    inclusiveArray(10, 20) ➞ [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
    inclusiveArray(17, 5) ➞ [17]

    IMPORTANT
    The use of IntStream.
    range and IntStream.rangeClosed is totally unacceptable,
    hence, recursion is the very purpose of this challenge.

    Notes
    The numbers in the array are sorted in ascending order.
    If startNum is greater than endNum, return an array with the higher value. See example #4.
    You are expected to solve this challenge via a recursive approach.
     */

    public static void main(String[] args) {
        printArray(inclusiveArray(1, 5));  // [1, 2, 3, 4, 5]
        printArray(inclusiveArray(2, 8));  // [2, 3, 4, 5, 6, 7, 8]
        printArray(inclusiveArray(10, 20));  //  [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
        printArray(inclusiveArray(17, 5));  // [17]
    }

    public static int[] inclusiveArray(int startNum,int endNum) {
        int[] result = new int[startNum < endNum ? 1 + (endNum - startNum) : 1];
        result[0] = startNum;
        return inclusiveArray(startNum, endNum, result, 0);
    }
    private static int[] inclusiveArray(int startNum,int endNum, int[] arr, int i) {
        if (startNum > endNum || i >= arr.length)
            return arr;
        arr[i] = startNum;
        return inclusiveArray(startNum + 1, endNum, arr, i + 1);
    }


    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int item : arr) {
            System.out.print(item);
            if (item != arr[arr.length - 1])
                System.out.print(", ");
        }
        System.out.print("]\n");
    }


}
