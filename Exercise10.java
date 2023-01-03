public class Exercise10 {
    /*
    https://edabit.com/challenge/WmGeYLJbud69ezCew

    Coin Co-Operation
    Let's say that there exists a machine that gives out free coins,
    but with a twist!
    Separating two people is a wall,
    and this machine is placed in such a way that both people are able to access it.
    Spending a coin in this machine will give the person on the other side 3 coins and vice versa.
    If both people continually spend coins for each other (SHARING),
    then they'll both gain a net profit of 2 coins per turn. However,
    there is always the possibility for someone to act selfishly (STEALING):
    they spend no coins, yet they still receive the generous 3 coin gift from the other person!
    Here's an example of Red taking advantage of Green! Red chose to betray

    The Challenge
    Assuming that both people start with 3 coins each,
    create a function that calculates both people's final number of coins.
    You will be given two arrays of strings, with each string being the words "share" or "steal".
     */

    public static void main(String[] args) {
        String[] str1 = {"share"};
        String[] str2 = {"steal"};
        String[] str3 = {"share", "share", "share"};
        String[] str4 = {"steal", "share", "steal"};

        System.out.println(getCoinBalances(str1, str1));  // ➞ [5, 5]
        // Both people spend one coin, and receive 3 coins each.

        System.out.println(getCoinBalances(str2, str1));  // ➞ [6, 2]
        // Person 1 gains 3 coins, while person 2 loses a coin.

        System.out.println(getCoinBalances(str2, str2));  // ➞ [3, 3]
        // Neither person spends any coins and so no one gets rewarded.

        System.out.println(getCoinBalances(str3, str4));  // ➞ [3, 11]
    }

    public static int[] getCoinBalances(String[] r, String[] b) {
        int[] arr = new int[2];
        for (int i = 0; i < r.length; i++) {

        }
        return arr
    }

}
