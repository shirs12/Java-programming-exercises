public class Exercise15 {
    /*
    https://edabit.com/challenge/dreQhsnZJ7HGtsts5

    Paul Cipher

    In Paul Cipher, only alpha characters will be encoded with the following rules:

    * All alpha characters will be treated as uppercase letters.
    * The first alpha character will not change (except for switching to upper case).
    * All subsequent alpha characters will be shifted toward "Z",
     by the alphabetical position of the previous alpha character (wrap back to "A" if "Z" is passed).

    paulCipher("he1lo") ➞ "HM1QA"

    h -> H (First character to be changed to uppercase)
    e -> M (H is the previous alpha character and the 8th letter in the alphabet. E + 8 = M)
    1 -> 1 (Keep all characters other than alphabets as it is)
    l -> Q (E is the previous alpha character and 5th letter in the alphabets. L + 5 = Q)
    o -> A (L is the previous alpha character and 12th letter in the alphabets. O + 12 = A)

    Given a string txt, return the encoded message.

    Examples
    paulCipher("d33p x4v13r") ➞ "D33T N4T13N"
    paulCipher("T3sh 1s my w0rlD.") ➞ "T3MA 1A FL V0ODP."
    paulCipher("muBas41r") ➞ "MHWCT41K"
    paulCipher("a1rForce") ➞ "A1SXUGUH"
    paulCipher("MATT") ➞ "MNUN"

     */

    public static void main(String[] args) {
        System.out.println(paulCipher("d33p x4v13r"));  // D33T N4T13N
        System.out.println(paulCipher("T3sh 1s my w0rlD."));  // T3MA 1A FL V0ODP.
        System.out.println(paulCipher("muBas41r"));  // MHWCT41K
        System.out.println(paulCipher("a1rForce"));  // A1SXUGUH
        System.out.println(paulCipher("MATT"));  // MNUN
    }

    public static String paulCipher(String txt) {
        String encrypted = "" + txt.toUpperCase().charAt(0);
        char prev = encrypted.charAt(0);
        int code, ACode = 'A', ZCode = 'Z';

        for (int i = 1; i < txt.length(); i++) {
            char c = txt.toUpperCase().charAt(i);
            if ((int)c >= ACode && (int)c <= ZCode){
                code = ((int)prev - (ACode-1)) + ((int)c - (ACode-1)) + (ACode-1);
                if (code > ZCode) code = code - ZCode + ACode-1;
                encrypted += String.valueOf((char) code).toUpperCase();
                prev = txt.toUpperCase().charAt(i);
            }
            else encrypted += txt.toUpperCase().charAt(i);
        }
        return encrypted;
    }

}
