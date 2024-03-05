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

        int xPositionM = 0;
        int xPositionP = 0;
        int yPositionM = 0;
        int yPositionP = 0;

        for (int i = 0; i < matixDimension; i++) {
            for (int j = 0; j < matixDimension; j++) {
                if ("m".equals(arena[i][j])) {
                    xPositionM = j;
                    yPositionM = i;
                } else if ("p".equals(arena[i][j])) {
                    xPositionP = j;
                    yPositionP = i;

                }

            }
        }

        while (xPositionP != xPositionM || yPositionP != yPositionM) {
            if (xPositionM > xPositionP) {
                System.out.println("LEFT");
                xPositionM--;
            }
            if (xPositionM < xPositionP) {
                System.out.println("RIGHT");
                xPositionM++;
            }


            if (yPositionM > yPositionP) {
                System.out.println("UP");
                yPositionM--;
            }
            if (yPositionM < yPositionP) {
                System.out.println("DOWN");
                yPositionM++;
            }
        }


    }
}
