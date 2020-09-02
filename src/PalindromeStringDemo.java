import java.util.Scanner;

public class PalindromeStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner word=new Scanner(System.in);
		String wow,ans="";
		wow=word.next();
		for(int i=wow.length()-1;i>=0;i--) {
			ans=ans+wow.charAt(i);
			
		}
		if(ans.equals(wow)) {
			System.out.println(wow+" is Palindrom!");
		}else {
			System.out.println(wow+ " is not Palindrom!");
		}
		
		

	}

}
