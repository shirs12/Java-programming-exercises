public class Exercise04 {
    /*
    https://edabit.com/challenge/tfD8Ct9niGcvS5usN

    Opposite House
    Tasha was walking through a straight street,
    with exactly n identical houses on both sides.
    House numbers in the street look like this:

    1 |   | 6
    3 |   | 4
    5 |   | 2

    She noticed that even numbered houses,
    increase on the right,
    while odd numbered houses decrease on the left.
    Create a function that takes a house number 'house'
    and length of the street 'n'
    and returns the house number on the opposite side.
     */

    public static void main(String[] args) {
        System.out.println(oppositeHouse(3,5));
    }

    public static int oppositeHouse(int house, int n){
        /* The sum of every 2 opposite houses is constant,
        so the length of the street multiplied by 2 plus 1,
        gives us that sum.
        To get the opposite house, is to subtract the house number that given.
        */
        return ((2 * n) + 1) - house;
    }

}
