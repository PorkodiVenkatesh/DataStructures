class Solution {
    public int subarraySum(int[] nums, int k) {
        
        ArrayList<Integer> sumSA = new ArrayList<Integer>();
		
		for(int i =0; i<nums.length; i++) {
			for (int j = i; j<nums.length; j++) {
				int sum =0;
				for(int k1 =i ; k1<=j; k1++) {
					sum = sum + nums[k1];
				}
				sumSA.add(sum);
			}
		}
		
		int kCounts= 0;
		for (Integer sum : sumSA) {
			if(sum==k) {
				kCounts++;
			}
		}
		return kCounts;
    }
}
