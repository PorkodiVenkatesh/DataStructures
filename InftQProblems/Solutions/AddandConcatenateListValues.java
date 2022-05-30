package Problems.Solutions;

import java.util.*;

public class AddandConcatenateListValues {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        String input = sc.next();

        ArrayList<Integer> al = new ArrayList<Integer>();
        String s = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            System.out.println("ch= " + ch);
            if (ch != ',') {
                s = s + ch;
            } else {
                System.out.println("s= " + s);
                al.add(Integer.parseInt(s));
                s = "";
            }

        }
        System.out.println(al);
        int indexof5 = al.indexOf(5);
        int indexOf8 = al.indexOf(8);

        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < al.size(); i++) {
            if ((i >= indexof5) && (i <= indexOf8)) {
                num2 = num2 * 10 + al.get(i);
            } else {
                num1 += al.get(i);
            }
        }

        System.out.println("num1= " + num1 + " num2 = " + num2 + " num1+num2 = " + (num1 + num2));

    }

}
