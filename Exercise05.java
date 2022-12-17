import java.util.HashMap;
import java.util.Map;

public class Exercise05 {
    /*
    https://edabit.com/challenge/KESQCRf5mJd7x6Rfh

    Remove Duplicates from an Array
    Create a method that takes an array of strings or integers,
    removes all duplicate items and returns a new array,
    in the same sequential order as the old array
    (minus duplicates).
     */

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0,1,1,4,6,5,4,4,8};
        String[] arrs = {"The", "big", "cat"};
        printArray(removeDups(arr));
        printArray(removeDups(arrs));
    }

    public static void printArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.print(array[array.length-1] + "]");
        System.out.println();
    }
    public static void printArray(String[] array){
        System.out.print("[");
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.print(array[array.length-1] + "]");
        System.out.println();
    }

    public static int[] removeDups(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i] + 1));
            else map.put(arr[i], 1);
        }
        int[] newArr = new int[map.size()];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            newArr[i] = entry.getKey();
            i++;
        }
        return newArr;
    }
    public static String[] removeDups(String[] arr) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i] + 1));
            else map.put(arr[i], 1);
        }
        String[] newArr = new String[map.size()];
        int i = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            newArr[i] = entry.getKey();
            i++;
        }
        return newArr;
    }


}








