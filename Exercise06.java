public class Exercise06 {
    /*
    https://edabit.com/challenge/9xSy9uu6MaEKS4kPC

    Tower of Hanoi

    There are three towers.
    The objective of the game is to move all the disks over to tower #3,
    but you can't place a larger disk onto a smaller disk.
    To play the game or learn more about the Tower of Hanoi,
    check the Resources tab.

    Create a function that takes a number of discs as an argument
    and returns the minimum amount of steps needed to complete the game.
     */

    public static void main(String[] args) {
        System.out.println(towerHanoi(5));
    }

    public static int towerHanoi(int discs) {
        if (discs == 0)
            return 1;
        return towerHanoi(discs - 1) + towerHanoi(discs - 1);
    }


}
