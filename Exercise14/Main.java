package Exercise14;

public class Main {
    /*
    https://edabit.com/challenge/x2mxt5c6Qp4Nr5qDv

    Rounding In Millions

    Given an array of cities and populations,
    return an array where all populations are rounded to the nearest million.

    Examples
    millionsRounding([
      ["Nice", 942208],
      ["Abu Dhabi", 1482816],
      ["Naples", 2186853],
      ["Vatican City", 572]
    ]) ➞ [
      ["Nice", 1000000],
      ["Abu Dhabi", 1000000],
      ["Naples", 2000000],
      ["Vatican City", 0]
    ]

    millionsRounding([
      ["Manila", 13923452],
      ["Kuala Lumpur", 7996830],
      ["Jakarta", 10770487]
    ]) ➞ [
      ["Manila", 14000000],
      ["Kuala Lumpur", 8000000],
      ["Jakarta", 11000000]
    ]

    Notes
    Round down to 0 if a population is below 500,000.
     */

    public static void main(String[] args) {
        Object[] cities = {
                new City("Nice", 942208),
                new City("Abu Dhabi", 1482816),
                new City("Naples", 2186853),
                new City("Vatican City", 572)
        };
        Object[] cities2 = {
                new City("Manila", 13923452),
                new City("Kuala Lumpur", 7996830),
                new City("Jakarta", 10770487),
        };
//        printArray(millionsRounding(cities));
        printArray(millionsRounding(cities2));
    }

    public static Object[] millionsRounding(Object[] cities) {
        int num;

        for (Object city : cities) {
            int current = ((City) city).population;
            num = current % 1000000;
            if (num > 500000)
                ((City) city).population = (current / 1000000 + 1) * 1000000;
            else ((City) city).population = (current / 1000000) * 1000000;
        }

        return cities;
    }

    public static void printArray(Object[] arr) {
        for (Object item : arr) {
            System.out.println(item);
        }
    }


}


