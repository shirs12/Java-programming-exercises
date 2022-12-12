public class Exercise02 {
    /*
    https://edabit.com/challenge/A2M6aC7BR2P4Qj2Kr
    Crowded Carriage Capacity:
    A train has a maximum capacity of n passengers overall,
    which means each carriage's capacity will share an equal proportion of the maximum capacity.
    Create a function which returns the index of the first carriage,
    which holds 50% or less of its maximum capacity.
    If no such carriage exists, return -1.
     */
    public static void main(String[] args) {
        int[] arr = {35, 23, 18, 10, 40};
        System.out.println(FindSeat(200,arr));
    }

    public static int FindSeat(int n, int[] arr){
        double avg = (double) n / arr.length;

        for (int i = 0; i < arr.length; i++) {
            if ((double)arr[i] / avg <= 0.5)
                return i;
        }

        return -1;
    }



}
