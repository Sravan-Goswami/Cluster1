package week_one;

import java.util.Scanner;

public class question_one {
	
	    public static int findMin(int[] nums) {
	        if (nums == null || nums.length == 0) {
	           
	            throw new IllegalArgumentException("Array cannot be null or empty.");
	        }

	        int low = 0;
	        int high = nums.length - 1;

	        if (nums[low] <= nums[high]) {
	            return nums[low];
	        }

	        while (low < high) {
	            int mid = low + (high - low) / 2; 

	            if (nums[mid] > nums[high]) {
	                low = mid + 1;
	            } 
	            else {
	                high = mid;
	            }
	        }

	        return nums[low];
	    }

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        int N = scanner.nextInt();

	        int[] arr = new int[N];
	        for (int i = 0; i < N; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        int minElement = findMin(arr);
	        System.out.println(minElement);
		
		
	}

}
