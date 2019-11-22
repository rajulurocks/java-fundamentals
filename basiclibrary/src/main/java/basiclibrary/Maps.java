package basiclibrary;

import java.util.HashSet;

public class Maps {

    public boolean MapsTemp() {


        {


            int[][] weeklyMonthTemperatures = {
                    {66, 64, 58, 65, 71, 57, 60},
                    {57, 65, 65, 70, 72, 65, 51},
                    {55, 54, 60, 53, 59, 57, 61},
                    {65, 56, 55, 52, 55, 62, 57}
            };

            HashSet<Integer> WeatherData = new HashSet<>();

            int min = 1000;
            int max = 0;

            for (int row = 0; row < weeklyMonthTemperatures.length; row++) {
                for (int col = 0; col < weeklyMonthTemperatures[row].length; col++) {

                    // System.out.println(weeklyMonthTemperatures[row][col]);
                    //  weeklyMonthTemperatures[row][col] = row * col;

                    if (min > weeklyMonthTemperatures[row][col]) {
                        min = weeklyMonthTemperatures[row][col];
                    }

                    if (max < weeklyMonthTemperatures[row][col]) {
                        max = weeklyMonthTemperatures[row][col];
                    }

                    WeatherData.add(weeklyMonthTemperatures[row][col]);

                    //System.out.println(max);

                }
            }

            for (int range = min; range <= max; range++) {
                if (WeatherData.contains(range)) {

                } else {
                    System.out.println("Never saw temperature: " + range);
                }

            }


        }


        return true;



    }
}
