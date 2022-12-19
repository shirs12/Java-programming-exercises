import java.util.HashMap;
import java.util.Map;

public class Exercise09 {
    /*
    https://edabit.com/challenge/ENozFXdPz9YTTHdps

    Count the Number of Duplicate Characters

    Create a function that takes a string,
    and returns the number of alphanumeric characters that occur more than once.
     */

    public static void main(String[] args) {
        System.out.println(duplicateCount("abcde"));  // ➞ 0
        System.out.println(duplicateCount("aabbcde"));  // ➞ 2
        System.out.println(duplicateCount("Indivisibilities"));  // ➞ 2
        System.out.println(duplicateCount("Aa"));  // ➞ 0, Case sensitive
    }

    public static int duplicateCount(String str) {
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i)))
                map.put(str.charAt(i), 1);
            else map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
        }
        for (Integer value : map.values()){
            if (value > 1)
                count++;
        }
        return count;
    }

}
