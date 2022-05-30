package Problems.Solutions;

import java.util.Scanner;

public class NearestGreatestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";

        int n = sc.nextInt();
        String num = String.valueOf(n);
        int digits = num.length();
        int nextMid = digits / 2;
        boolean isOdd = digits % 2 == 1;
        if (isOdd) {
            nextMid = nextMid + 1;
        }
        System.out.println(nextMid);
        if (checkLastHalfAreZeros(num.substring(nextMid))) {
            System.out.println("Last Half are Zeros");
            result = num.substring(0, nextMid);
        } else {
            System.out.println("Find the greatest number with Last Half are Zeros");
            result = num.substring(0, nextMid - 1)
                    + String.valueOf(Character.getNumericValue(num.charAt(nextMid - 1)) + 1);
        }
        int endIndex = result.length();
        if (isOdd) {
            endIndex = endIndex - 1;
        }
        result = result + new StringBuilder(result.substring(0, endIndex)).reverse().toString();
        System.out.println(result);

    }

    public static boolean checkLastHalfAreZeros(String lastHalf) {
        for (int i = 0; i < lastHalf.length(); i++) {
            if (lastHalf.charAt(i) != '0')
                return false;
        }
        return true;
    }

}
