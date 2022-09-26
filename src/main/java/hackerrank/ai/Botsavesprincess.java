package hackerrank.ai;

import java.util.Scanner;

public class Botsavesprincess {

    public static void main(String[] args) {

        Scanner scanner = new Scanner("3\n" +
                "---\n" +
                "-m-\n" +
                "p--\n");


        String[][] grid = null;


        while (scanner.hasNext()) {
            String n = scanner.next();
            grid = new String[Integer.parseInt(n)][Integer.parseInt(n)];
            for (int x = 0; x < grid.length; x++) {
                String stringLine = scanner.next();
                String[] split = stringLine.split("");
                int position = 0;
                for (int y = 0; y < grid.length; y++) {
                    grid[x][y] = split[position];
                    position ++;
                }
            }

        }

        scanner.close();

        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid.length; y++) {
                if (grid[x][y].equals("m")) {
                    if (x > 0 && y > 0) {
                        if (grid[x - 1][y - 1] .equals("p")) {
                            System.out.println("UP\nLEFT");
                            break;
                        }
                    }
                    if (x > 0 && y < grid.length - 1) {
                        if (grid[x - 1][y + 1].equals("p")) {
                            System.out.println("UP\nRIGHT");
                            break;
                        }
                    }
                    if (x < grid.length - 1 && y < grid.length - 1) {
                        if (grid[x + 1][y + 1].equals("p")) {
                            System.out.println("DOWN\nRIGHT");
                            break;
                        }
                    }
                    if (x < grid.length - 1 && y > 0) {
                        if (grid[x + 1][y - 1] .equals("p")) {
                            System.out.println("DOWN\nLEFT");
                            break;
                        }
                    }
                }
            }
        }
    }
}
