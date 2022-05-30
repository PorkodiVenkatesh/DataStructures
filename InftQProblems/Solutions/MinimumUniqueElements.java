package Problems.Solutions;

import java.util.*;

public class MinimumUniqueElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String input = sc.next();

        LinkedList<Integer> al = new LinkedList<Integer>();
        String s = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != ',') {
                s = s + ch;
            } else {
                al.add(Integer.parseInt(s));
                s = "";
            }
        }
        Collections.sort(al);
        System.out.println(al);
        // Removing the n elements
        for (int i = 0; i < n; i++) {
            al.pollFirst();
        }
        System.out.println("Array after removing " + n + " elements: " + al);
        TreeSet<Integer> uniqueElements = new TreeSet<>(al);
        System.out.println("No of unqique elements = " + uniqueElements.size());
    }
}
