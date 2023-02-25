public class Exercise13 {
    /*
    https://edabit.com/challenge/dreQhsnZJ7HGtsts5

    Recursion: Integer Digits Count

    Create a function that recursively counts the
    integer's number of digits.
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
        return count(n / 10) + 1;
    }
}
