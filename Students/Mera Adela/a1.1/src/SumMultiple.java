import java.util.Scanner;
public class SumMultiple {
	
	public static void main (String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number:");
		int nr = keyboard.nextInt();
		System.out.println("The sum is "+calculateSum(nr));
	}
	
	public static int calculateSum(int number){
		int sum=0;
		int i=1;
		while (i<number){
			if ((i%3==0)||(i%5==0)){
				sum+=i;
			}
			i++;
		}
		return sum;
		
	}

}
