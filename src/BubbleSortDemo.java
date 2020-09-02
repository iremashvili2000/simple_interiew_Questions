import java.util.Scanner;

public class BubbleSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n=new Scanner(System.in);
		System.out.println("enter array's length: ");
		int N=n.nextInt();
		int[] intArray=new int[N];
		System.out.println("enter array's number: ");
		for(int i=0;i<intArray.length;i++) {
			intArray[i]=n.nextInt();
		}
		System.out.println();
		for(int i:intArray) {
			System.out.print(i+" ");
		}
		bubbleSort(intArray);
		System.out.println();
		for(int i:intArray) {
			System.out.print(i+" ");
		}
	}
	
	
	public  static void bubbleSort(int[] intArray) {
		int temp=0;
		for(int i=0;i<intArray.length;i++) {
			
			for(int j=1;j<(intArray.length)-i;j++) {
				if(intArray[j-1]>intArray[j]) {
					//swap
					temp=intArray[j-1];
					intArray[j-1]=intArray[j];
					intArray[j]=temp;
				}
				/*
				System.out.println();
				for(int c=0;c<intArray.length;c++) {
					System.out.print(intArray[c]+" ");
				}
				*/
			}
			
		}
		
	}
	
	

}
