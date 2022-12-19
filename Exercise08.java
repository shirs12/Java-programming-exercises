public class Exercise08 {
    /*
    https://edabit.com/challenge/pkMPzrmsNN9RRnMqx

    Cup Swapping

    There are three cups on a table, at positions A, B, and C.
    At the start, there is a ball hidden under the cup at position B.
    Image of cups where ball is under middle cup
    However, I perform several swaps on the cups, which is notated as two letters.
    For example, if I swap the cups at positions A and B, I could notate this as AB or BA.
    Create a function that returns the letter position that the ball is at,
    once I finish swapping the cups. The swaps will be given to you as an array.
     */

    public static void main(String[] args) {
        String[] cup1 = {"AB", "CA"};
        String[] cup2 = {"AC", "CA", "CA", "AC"};
        String[] cup3 = {"BA", "AC", "CA", "BC"};
        System.out.println(cupSwapping(cup1));  // ➞ "C"
        System.out.println(cupSwapping(cup2));  // ➞ "B"
        System.out.println(cupSwapping(cup3));  //➞ "A"
    }

    public static String cupSwapping(String[] cups) {

        return 
    }

}
