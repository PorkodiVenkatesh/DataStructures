package Problems.Solutions;

import java.util.*;

public class PasswordGeneration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String string = "", number = "";
        LinkedHashMap<String, Integer> pairs = new LinkedHashMap<>();
        String result = "";

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
            System.out.println("For String " + key);
            Integer position = findPosition(key.length(), pairs.get(key));
            System.out.println(" Position: " + position);
            if (position <= 0) {
                result = result + 'X';
                System.out.println("added X to the password");
            } else {
                char ch = key.charAt(position - 1);
                result = result + ch;
                System.out.println("added " + ch + " to the password");
            }

        }
        System.out.println("Password is " + result);

    }

    public static Integer findPosition(int length, Integer num) {
        System.out.println(" String length is " + length);
        Integer position = -1;
        var digits = new TreeSet<Integer>();
        while (num > 0) {
            int rem = num % 10;
            digits.add(rem);
            num = num / 10;
        }
        System.out.println(" Digits are " + digits);
        for (Integer i : digits) {
            if (i <= length) {
                position = i;
            }
            if (i > length) {
                break;
            }
        }

        return position;
    }

}
