public class Exercise16 {
    /*
    https://edabit.com/challenge/JmuM2cP5MvruRjr6c

    Atbash Cipher

    The Atbash cipher is an encryption method,
    in which each letter of a word is replaced with
    its "mirror" letter in the alphabet: A <=> Z; B <=> Y; C <=> X; etc.

    Create a function that takes a string and applies the Atbash cipher to it.

    Examples
    atbash("apple") ➞ "zkkov"
    atbash("Hello world!") ➞ "Svool dliow!"
    atbash("Christmas is the 25th of December") ➞ "Xsirhgnzh rh gsv 25gs lu Wvxvnyvi"

    Notes
    * Capitalisation should be retained.
    * Non-alphabetic characters should not be altered.
     */

    public static void main(String[] args) {
        System.out.println(atbash("apple"));  // zkkov
        System.out.println(atbash("Hello world!"));  // Svool dliow!
        System.out.println(atbash("Christmas is the 25th of December"));  // Xsirhgnzh rh gsv 25gs lu Wvxvnyvi
    }

    public static String atbash(String str) {
        StringBuilder encrypted = new StringBuilder();
        int ACode = 'A', ZCode = 'Z', aCode = 'a', zCode = 'z';

        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i);
            if (c >= ACode && c <= ZCode){
                encrypted.append((char) (ZCode - (c - ACode)));
            } else if (c >= aCode && c <= zCode) {
                encrypted.append((char) (zCode - (c - aCode)));
            }
            else encrypted.append(str.charAt(i));
        }
        return encrypted.toString();
    }

}



