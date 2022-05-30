package Problems.Solutions;

import java.util.*;

public class LargestEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int inputLen = input.length();

        String numbers = "0123456789";
        TreeSet<Integer> digits = new TreeSet<>();
        int result = 0;

        for (int i = 0; i < inputLen; i++) {
            String ch = String.valueOf(input.charAt(i));
            if (numbers.contains(ch)) {
                digits.add(Integer.parseInt(ch));
            }
        }
        List<Integer> uniqueDigits = new ArrayList<Integer>(digits.descendingSet());
        System.out.println("Unique digits in the given string: " + uniqueDigits);
        int minEven = findMinimumEvenNumber(uniqueDigits);
        if (minEven == -1) {
            System.out.println(
                    "There is no even number in the given input string. So we can't find the Largest Even Number");
        } else {
            uniqueDigits.remove(uniqueDigits.indexOf(minEven));
            for (Integer i : uniqueDigits) {
                result = (result * 10) + i;
            }
            result = (result * 10) + minEven;
            System.out.println("Largest Even Number is " + result);
        }

    }

    public static Integer findMinimumEvenNumber(List<Integer> uniqueDigits) {
        Integer min = -1;
        for (int i = uniqueDigits.size() - 1; i >= 0; i--) {
            if (uniqueDigits.get(i) % 2 == 0) {
                min = uniqueDigits.get(i);
                break;
            }
        }
        return min;
    }

}
