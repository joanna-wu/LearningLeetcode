public class solution{
	public int removeDuplicates(int[] nums){
		int N = nums.length;
		int i=1;
		int j=0; //current index
		for(int ; i<N; i++){
			if(nums[j]!=nums[i]){
				j++;
				nums[j] = nums[i]; //since it's sorted array
			}
		}
		return j+1;
	}
}