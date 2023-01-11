package hackerrank.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class BirthdayCakeCandlesResult {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int totalCandles = 1;

        for (int i = 0; i < candles.size() - 1; i++) {
            int candlesMatches = 1;
            for (int j = 1; j < candles.size(); j++) {
                if (i != j) {
                    if (candles.get(i) == candles.get(j)) {
                        candlesMatches++;
                    }
                    if (candlesMatches > totalCandles) {
                        totalCandles = candlesMatches;
                    }
                }
            }
        }
        return totalCandles;
    }


}

public class BirthdayCakeCandles {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = BirthdayCakeCandlesResult.birthdayCakeCandles(candles);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
        System.out.println(result);
    }
}
