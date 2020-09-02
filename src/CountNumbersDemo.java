import java.util.Scanner;

public class CountNumbersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ans=new Scanner(System.in);
		System.out.println("enter number: ");
		int d=ans.nextInt();
		int count=0;
		while(d!=0) {
			d=d/10;
			count++;
		}
		System.out.println("number's length is "+count);
		
		

	}

}
