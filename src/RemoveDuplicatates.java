import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner word=new Scanner(System.in);
		String str=word.next();
	System.out.println(removeDuplicates(str));
		

	}
	
	public static String removeDuplicates(String str) {
		Set<Character> set=new HashSet<>();
		StringBuffer sf=new StringBuffer();
		for(int i=0;i<str.length();i++) {
			Character ans=str.charAt(i);
			if(!set.contains(ans)) {// vamowmeb aris tu ara set shi set shi ver iqneba ori ertnairi obieqti hashset gamo
				set.add(ans);// tu ar aris vamateb
				sf.append(ans);// calke vwer im sityvas rac migeba append vamateb asoebs
				
				
			}
		}
		
		return sf.toString();
	}

}
