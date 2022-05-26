class Solution {
    public int shortestSubarray(int[] nums, int k) {
        ArrayList<Integer> subArrayLengths = new ArrayList<Integer>();
		
		for(int i =0; i<nums.length; i++) {
			for (int j = i; j<nums.length; j++) {
				int sum =0, length =0;
				for(int k1 =i ; k1<=j; k1++) {
                    length++;
					sum = sum + nums[k1];
				}
				if(sum >= k){
                    subArrayLengths.add(length);
                }
			}
		}
        
        if (subArrayLengths.size() == 0)
            return -1;
		
		return Collections.min(subArrayLengths);
    }
}
