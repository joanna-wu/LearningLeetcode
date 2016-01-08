public class solution{
	public int lengthOfLastWord(String s){
		char[] sChar = s.toCharArray();
		int N=0;
		for(int i=sChar.length-1; i>=0; i--){
			if(sChar[i]==' '){
				N=sChar.length-i-1;
				break;
			}
			if(sChar[i]!=' ' && i==0){
				N=sChar.length;
			}
		}
		return N;
	}
}