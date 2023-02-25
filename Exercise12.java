public class Exercise12 {
    /*
    https://edabit.com/challenge/9obr3kYYua78Lw6yH

    Generate All Nonconsecutive Binary Strings

    Create a function to generate all nonconsecutive binary strings,
    where nonconsecutive is defined as a string,
    where no consecutive ones are present,
    and where n governs the length of each binary string.
    */

    public static void main(String[] args) {
        System.out.println(generateNonconsecutive(1));  // "0 1"
        System.out.println(generateNonconsecutive(2));  // "00 01 10"
        System.out.println(generateNonconsecutive(3));  // "000 001 010 100 101"
        System.out.println(generateNonconsecutive(4));  // "0000 0001 0010 0100 0101 1000 1001 1010"

        System.out.println(generateNonconsecutive(6));  // "000000 000001 000010 000100 000101 001000 001001 001010 010000 010001 010010 010100 010101 100000 100001 100010 100100 100101 101000 101001 101010"
    }

    public static String generateNonconsecutive(int n) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        String str = Integer.toBinaryString(count);

        while (str.length() <= n) {
            if (!str.contains("11")){
                if (str.length() < n) {
                    for (int i = str.length(); i < n; i++) {
                        result.append("0");
                    }
                }
                result.append(str).append(" ");
            }
            count++;
            str = Integer.toBinaryString(count);
        }
        return result.toString();
    }

}
