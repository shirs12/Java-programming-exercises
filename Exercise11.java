public class Exercise11 {
    /*
    https://edabit.com/challenge/3S8XppR6Yf5mXPxij

    Simulate the Game "Rock, Paper, Scissors"
    Create a function which simulates the game "rock, paper, scissors".
    The function takes the input of both players (rock, paper or scissors),
    first parameter from first player, second from second player.
    The function returns the result as such:
    "Player 1 wins"
    "Player 2 wins"
    "TIE" (if both inputs are the same)

     */
    public static void main(String[] args) {
        System.out.println(rps("rock", "paper"));  // "Player 2 wins"

        System.out.println(rps("paper", "rock"));  // "Player 1 wins"

        System.out.println(rps("paper", "scissors"));  // "Player 2 wins"

        System.out.println(rps("scissors", "scissors"));  // "TIE"

        System.out.println(rps("scissors", "paper"));  // "Player 1 wins"
    }

    public static String rps(String s1, String s2) {
        String[] arr = {"rock", "paper", "scissors"};

        if ((s1.equals(arr[1]) && s2.equals(arr[0])) || // rock, paper
         (s1.equals(arr[2]) && s2.equals(arr[1])) ||  // paper, scissors
                (s1.equals(arr[0]) && s2.equals(arr[2]))){  // scissors, rock
            return "Player 1 wins";
        } else if (s1.equals(s2)) {
            return "TIE";
        }
        return "Player 2 wins";
    }
}
