import java.util.Scanner;

public class PerfectSquareDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int  num=sc.nextInt();
		for(int i=1;i<=num/2;i++) {
			if(i*i==num) {
				System.out.println("Given number is square of "+i);
				return;
			}else {
				if(i*i>num) {
					System.out.println("given number isn't square!");
					break;
				}
				
			}
				
			
			
		}
		

	}

}
