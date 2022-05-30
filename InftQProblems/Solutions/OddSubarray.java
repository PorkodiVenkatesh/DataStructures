package Problems.Solutions;

import java.util.*;

public class OddSubarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter queries: ");
        int queries = sc.nextInt();

        ArrayList<ArrayList<Integer>> array2D = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < queries; i++) {
            System.out.println("For the query " + (i + 1) + ", enter array size: ");
            int n = sc.nextInt();
            array2D.add(new ArrayList<Integer>());
            System.out.println("Enter " + n + " values: ");
            for (int j = 0; j < n; j++) {
                array2D.get(i).add(sc.nextInt());
            }
        }
        System.out.println(array2D);
        for (int i = 0; i < queries; i++) {
            ArrayList<ArrayList<Integer>> subarrays = findDistinctSubArrays(array2D.get(i));
            ArrayList<ArrayList<Integer>> oddSubarrays = findOddSumSubArrays(subarrays);
            System.out.println("Count of distinct sub arrays with odd sum: " + oddSubarrays.size());
        }

    }

    public static ArrayList<ArrayList<Integer>> findOddSumSubArrays(ArrayList<ArrayList<Integer>> subarrays) {
        ArrayList<ArrayList<Integer>> oddSubArrays = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < subarrays.size(); i++) {
            int sum = 0;
            for (int j = 0; j < subarrays.get(i).size(); j++) {
                sum += subarrays.get(i).get(j);
            }
            if (sum % 2 == 1) {
                oddSubArrays.add(subarrays.get(i));
            }
        }
        System.out.println("Odd sum sub arrays: " + oddSubArrays);
        return oddSubArrays;
    }

    public static ArrayList<ArrayList<Integer>> findDistinctSubArrays(ArrayList<Integer> array) {
        int n = array.size();
        int subArraysCount = (n * (n + 1)) / 2;
        ArrayList<ArrayList<Integer>> subArrays = new ArrayList<ArrayList<Integer>>();
        int index = 0;
        while (index < subArraysCount) {
            for (int i = 0; i < n; i++) {
                subArrays.add(new ArrayList<>());
                subArrays.get(index).add(array.get(i));
                index++;
                for (int k = i + 1; k < n; k++) {
                    subArrays.add(new ArrayList<>());
                    for (int j = i; j <= k; j++) {
                        subArrays.get(index).add(array.get(j));
                    }
                    index++;
                }

            }

        }

        System.out.println("Distinct sub arrays: " + subArrays);
        return subArrays;
    }

}
