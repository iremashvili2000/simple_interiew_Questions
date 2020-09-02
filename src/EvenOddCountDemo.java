import java.util.Scanner;

public class EvenOddCountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ans=new Scanner(System.in);
		System.out.println("enter number!");
		int d=ans.nextInt();
		int evenCount=0,oddCount=0;
		int num=0;
		
		while(d!=0) {
			num=d%10;
			if(num%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			d=d/10;
			
			
		}
		System.out.println("oddCount is "+oddCount+", evenCount "+evenCount);
		
		
		
	}

}
