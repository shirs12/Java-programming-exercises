import java.util.Arrays;

public class Exercise07 {
    /*
    https://edabit.com/challenge/yeewrR3MB9PZprwPT

    Check for Anagrams
    Create a function that takes two strings
    and returns either true or false
    depending on whether they're anagrams or not.
     */

    public static void main(String[] args) {
        System.out.println(isAnagram("cristian", "Cristina"));  // true
        System.out.println(isAnagram("Dave Barry", "Ray Adverb"));  // true
        System.out.println(isAnagram("Nope", "Note"));  // false
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        char[] str1 = s1.toLowerCase().toCharArray();
        char[] str2 = s2.toLowerCase().toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);
    }

}
