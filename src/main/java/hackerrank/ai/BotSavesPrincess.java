package hackerrank.ai;

import java.util.Scanner;

public class BotSavesPrincess {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int matixDimension = scanner.nextInt();

        String[][] arena = new String[matixDimension][matixDimension];

        for (int i = 0; i < matixDimension; i++) {
            String[] line = scanner.next().split("\\.*");
            int charAt = 0;
            while (charAt < line.length) {
                arena[i][charAt] = line[charAt];
                charAt++;
            }
        }

        int x_position_m = 0;
        int x_position_p = 0;
        int y_position_m = 0;
        int y_position_p = 0;

        for (int i = 0; i < matixDimension; i++) {
            for (int j = 0; j < matixDimension; j++) {
                if ("m".equals(arena[i][j])) {
                    x_position_m = j;
                    y_position_m = i;
                } else if ("p".equals(arena[i][j])) {
                    x_position_p = j;
                    y_position_p = i;

                }

            }
        }

        while (x_position_p != x_position_m && y_position_p != y_position_m) {
            if (x_position_m > x_position_p) {
                System.out.println("LEFT");
                x_position_m--;
            }
            if (x_position_m < x_position_p) {
                System.out.println("RIGHT");
                x_position_m++;
            }


            if (y_position_m > y_position_p) {
                System.out.println("UP");
                y_position_m--;
            }
            if (y_position_m < y_position_p) {
                System.out.println("DOWN");
                y_position_m++;
            }
        }


    }
}
