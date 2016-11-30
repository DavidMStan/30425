
public class Palindrome {

	public static void main(String[] args){
		long found=0;
		outerloop:
		for (int i=999; i>=100;i--){
			for (int j=999; j>=100; j--){
				found=i*j;
				if (isPalindrome(found)==true){
					break outerloop;
				}
			}
		}
		System.out.println("The largest palindrome is "+found);

	}
	public static boolean isPalindrome (long number){
		long copyNumber=number;
		long numberTwo=0;
		while (number!=0){
			numberTwo=numberTwo*10 +(number%10);
			number=number/10;
			
		}
		if (copyNumber==numberTwo){
			    return true;
		    }
			else {
				return false;
			}
	}
}
