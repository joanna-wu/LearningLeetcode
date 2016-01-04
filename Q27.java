public class solution{
	public int removeElement(int[] nums, int val){
		int N = nums.length;
		int lens = N;
		for(int i=0; i<N; i++){
			if(nums[i] == val){
				lens--;
				nums[i]=Integer.MIN_VALUE;
			}
		}
		return lens;
	}
}