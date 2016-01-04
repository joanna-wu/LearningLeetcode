public class solution{
	public int removeDuplicates(int[] nums){
		int N = nums.length;
		int lens = N;
		for(int i=0; i<N; i++){
			for(int j=i+1; j<N; j++){
				if(nums[i]==nums[j] && nums[i]!=Integer.MIN_VALUE){
					lens--;
					nums[j]=Integer.MIN_VALUE;
				}
			}
		}
		return lens;
	}
}