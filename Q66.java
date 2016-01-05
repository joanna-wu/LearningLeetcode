public class solution{
	public int[] plusOne(int[] digits){
		int lens = digits.length;
		int index=0;
		for(int i=lens-1; i>=0; i--){
			if(digits[i]<9){
				digits[i]++;
				break;
			}
			else if(digits[i]==9){
				index=1;
				digits[i]=0;
			}
			if(index==1 && digits[0]==0){
				int[] ndigit=new int[lens+1]; //all zeors
				ndigit[0]=1;
				digits=ndigit;
			}
		}
		return digits;
	}
}