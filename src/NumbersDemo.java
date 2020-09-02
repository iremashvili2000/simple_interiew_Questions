import java.util.Scanner;

public class NumbersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new  Scanner(System.in);
		System.out.println("enter the minimum number: ");
		int i=scanner.nextInt();
		System.out.println("enter the maximum number: ");
		int g=scanner.nextInt();
		for(int a=i;a<=g;a++) {
			System.out.print(a+" ");
		}

	}

}
