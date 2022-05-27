class Solution {
    public int sumOfUnique(int[] nums) {
       int n = nums.length;	        
	     int sum = 0;
	        System.out.println(Arrays.toString(nums));
	        Arrays.sort(nums);
	        System.out.println(Arrays.toString(nums));
	        
	        int i = 0; 
	        while( i< n) {
	        	boolean isDup = false;
	        	int j = i+1;
	        	while(j<n){
	        		if(nums[i] == nums[j]) {
	        			isDup = true;
	        		}
	        		else {
	        			
	        			break;
	        		}
	        		j++;
	        	}
	        	
	        	if(isDup == false) {
	        		sum += nums[i];
	        	}
	         i = j;
	        	
	        }
	  	        return sum;
    }
}
