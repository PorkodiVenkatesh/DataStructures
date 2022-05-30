package Problems.Solutions;

import java.util.TreeSet;
import java.util.Scanner;

public class MinimumConsecutiveNumberinMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter no of rows: ");
        int rows = sc.nextInt();
        // System.out.println("Enter no of cols: ");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];

        // System.out.println("Enter" + rows * cols + " : ");
        for (int i = 0; i < rows; i++) {
            // System.out.println("For row " + (i + 1));
            for (int j = 0; j < cols; j++) {
                // System.out.println("For col " + (j + 1) + " Enter value:");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        TreeSet<Integer> consecutiveNums = new TreeSet<>();

        System.out.println("Checking Vertically Consecutive");
        for (int i = 0; i <= rows - 3; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                Integer temp = a[i][j];
                System.out.println("For a[" + i + "][" + j + "] = " + a[i][j]);
                if (!consecutiveNums.contains(temp)) {
                    if ((a[i + 1][j] == temp) && (a[i + 2][j] == temp)) {
                        consecutiveNums.add(temp);
                        System.out.println(a[i][j] + " is vertically consecutive");
                    }
                } else {
                    System.out.println(a[i][j] + " is already in the consecutiveNums set");
                }
            }
        }
        System.out.println("Checking Horizontally Consecutive");
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 3; j++) {
                Integer temp = a[i][j];
                System.out.println("For a[" + i + "][" + j + "] = " + a[i][j]);
                if (!consecutiveNums.contains(temp)) {
                    if ((a[i][j + 1] == temp) && (a[i][j + 2] == temp)) {
                        consecutiveNums.add(temp);
                        System.out.println(a[i][j] + " is horizontally consecutive");
                    }
                } else {
                    System.out.println(a[i][j] + " is already in the consecutiveNums set");
                }
            }
        }
        System.out.println("Checking Diagonally Consecutive");
        // Except last 2 rows
        for (int i = 0; i <= rows - 3; i++) {
            // except last 2 cols
            for (int j = 0; j <= cols - 3; j++) {
                Integer temp = a[i][j];
                System.out.println("For a[" + i + "][" + j + "] = " + a[i][j]);
                if (!consecutiveNums.contains(temp)) {
                    if ((a[i + 1][j + 1] == temp) && (a[i + 2][j + 2] == temp)) {
                        consecutiveNums.add(temp);
                        System.out.println(a[i][j] + " is Diagonally consecutive");
                    }
                } else {
                    System.out.println(a[i][j] + " is already in the consecutiveNums set");
                }
            }
            // for last 2 cols
            for (int j = cols - 2; j <= cols - 1; j++) {
                Integer temp = a[i][j];
                System.out.println("For a[" + i + "][" + j + "] = " + a[i][j]);
                if (!consecutiveNums.contains(temp)) {
                    if ((a[i + 1][j - 1] == temp) && (a[i + 2][j - 2] == temp)) {
                        consecutiveNums.add(temp);
                        System.out.println(a[i][j] + " is Diagonally consecutive");
                    }
                } else {
                    System.out.println(a[i][j] + " is already in the consecutiveNums set");
                }
            }
        }
        // for last 2 rows
        for (int i = rows - 2; i <= rows - 1; i++) {
            // except last 2 cols
            for (int j = 0; j <= cols - 3; j++) {
                Integer temp = a[i][j];
                System.out.println("For a[" + i + "][" + j + "] = " + a[i][j]);
                if (!consecutiveNums.contains(temp)) {
                    if ((a[i - 1][j + 1] == temp) && (a[i - 2][j + 2] == temp)) {
                        consecutiveNums.add(temp);
                        System.out.println(a[i][j] + " is Diagonally consecutive");
                    }
                } else {
                    System.out.println(a[i][j] + " is already in the consecutiveNums set");
                }
            }
            // for last 2 cols
            for (int j = cols - 2; j <= cols - 1; j++) {
                Integer temp = a[i][j];
                System.out.println("For a[" + i + "][" + j + "] = " + a[i][j]);
                if (!consecutiveNums.contains(temp)) {
                    if ((a[i - 1][j - 1] == temp) && (a[i - 2][j - 2] == temp)) {
                        consecutiveNums.add(temp);
                        System.out.println(a[i][j] + " is Diagonally consecutive");
                    }
                } else {
                    System.out.println(a[i][j] + " is already in the consecutiveNums set");
                }
            }
        }

        System.out.println("The consecutive numbers are " + consecutiveNums);
        System.out.println("The minimum consecutive number is " + consecutiveNums.first());

    }
}
