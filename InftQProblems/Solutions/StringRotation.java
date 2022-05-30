package Problems.Solutions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        String string = "", number = "";
        LinkedHashMap<String, Integer> pairs = new LinkedHashMap<>();
        ArrayList<String> result = new ArrayList<>();

        while (input.length() > 0) {
            System.out.println("input = " + input);
            int indexofcolon = input.indexOf(':');
            string = input.substring(0, indexofcolon);
            System.out.println("string = " + string);
            int indexofcomma = input.indexOf(',');
            if (indexofcomma != -1) {
                number = input.substring(indexofcolon + 1, indexofcomma);
                System.out.println("number = " + number);
                input = input.substring(indexofcomma + 1);
            } else {
                number = input.substring(indexofcolon + 1);
                System.out.println("number = " + number);
                input = "";
            }
            pairs.put(string, Integer.parseInt(number));
        }
        System.out.println(pairs);

        for (String key : pairs.keySet()) {
            System.out.println("For String : " + key);
            String s = key;
            if (isEven(getSquareSum(pairs.get(s)))) {
                System.out.println("squareSum is even, so rotating the string left by 1 position");
                int len = s.length() - 1;
                result.add(s.charAt(len) + s.substring(0, len));

            } else {
                System.out.println("squareSum is odd, so rotating the string right by 2 position");
                String temp = s.substring(0, 2);
                result.add(s.substring(2) + temp);
            }

        }
        System.out.println("Strings after rotations");
        for (String s : result) {
            System.out.print(s + " ");
        }

    }

    public static boolean isEven(Integer num) {
        return num % 2 == 0;
    }

    public static Integer getSquareSum(Integer num) {
        Integer squareSum = 0;
        while (num > 0) {
            int rem = num % 10;
            squareSum = squareSum + (rem * rem);
            num = num / 10;
        }
        System.out.println("squareSum = " + squareSum);
        return squareSum;
    }

}
