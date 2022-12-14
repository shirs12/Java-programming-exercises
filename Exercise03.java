public class Exercise03 {
    /*
    https://edabit.com/challenge/GJh9FraKutcnHoruX

    Find the Missing Number
    Create a method that takes an array of integers between 1 and 10,
    (excluding one number) and returns the missing number.
     */

    public static void main(String[] args) {
        int[] numbers = {3,9,5,8,1,6,2,7,4};
        printArray(numbers);
        mergeSort(numbers);
        printArray(numbers);
        System.out.println(missingNum(numbers));
    }

    public static void printArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.print(array[array.length-1] + "]");
        System.out.println();
    }

    public static int missingNum(int[] arr) {
        mergeSort(arr);
        int[] check = new int[10];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i + 1)
                check[i] = 1;
        }
        for (int i = 0; i < check.length; i++){
            if (check[i] == 0)
                return i + 1;
        }

        return -1;
    }

    // Complexity: O(n log n)
    public static void mergeSort(int[] arr) {
        int len = arr.length;
        if (len < 2)
            return;
        int mid = len / 2;
        int[] left = new int[mid];
        int[] right = new int[len - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }
    private static void merge(int[] arr, int[] left, int[] right){
        int leftSize = left.length;
        int rightSize = right.length;
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize){
            if (left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < leftSize){
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < rightSize){
            arr[k] = right[j];
            j++;
            k++;
        }
    }

}
