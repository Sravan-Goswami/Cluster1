package week_two;

import java.util.*;
public class question_two {

	 public static long findSmallestNonRepresentable(int[] arr, int n) {
	        long res = 1; // smallest number we cannot represent yet

	        for (int i = 0; i < n; i++) {
	            if (arr[i] <= res) {
	                res += arr[i]; // extend range
	            } else {
	                break; // gap found
	            }
	        }
	        return res;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Read input array
	        String[] input = sc.nextLine().trim().split(" ");
	        int n = input.length;
	        int[] arr = new int[n];

	        for (int i = 0; i < n; i++) {
	            arr[i] = Integer.parseInt(input[i]);
	        }

	        long result = findSmallestNonRepresentable(arr, n);
	        System.out.println(result);

	    }

}
