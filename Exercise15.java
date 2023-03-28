public class Exercise15 {
    /*
    https://edabit.com/challenge/dreQhsnZJ7HGtsts5

    Create a function that recursively counts the integer's number of digits.

    Examples
    count(318) ➞ 3
    count(-92563) ➞ 5
    count(4666) ➞ 4
    count(-314890) ➞ 6
    count(654321) ➞ 6
    count(638476) ➞ 6
     */

    public static void main(String[] args) {
        System.out.println(count(318));  // 3
        System.out.println(count(-92563));  // 5
        System.out.println(count(4666));  // 4
        System.out.println(count(-314890));  // 6
        System.out.println(count(654321));  // 6
        System.out.println(count(638476));  // 6
    }

    public static int count(int n) {
        if (n == 0)
            return 0;
        int result = count(n / 10) + 1;
        return result;
    }

}
