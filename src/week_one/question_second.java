package week_one;

import java.util.*;

public class question_second {
	
	 public static int subarraySum(int[] nums, int k) {
	        int count = 0; 
	        int currentSum = 0;


	        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();

	       
	        prefixSumMap.put(0, 1);

	        
	        for (int num : nums) {
	          
	            currentSum += num;


	            if (prefixSumMap.containsKey(currentSum - k)) {
	              
	                count += prefixSumMap.get(currentSum - k);
	            }

	         
	            prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        int n = scanner.nextInt();

	        
	        int[] nums = new int[n];
	        for (int i = 0; i < n; i++) {
	            nums[i] = scanner.nextInt();
	        }

	        int k = scanner.nextInt();
	        
	        int result = subarraySum(nums, k);
	        System.out.println(result);

	        scanner.close();
	    }


}
