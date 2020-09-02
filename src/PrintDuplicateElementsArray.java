import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateElementsArray {

	// write a java program to print duplicate elements in array
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		String duplicates[] =new String[] {"goga","ana","goga","ana","soso","nuca"};
		Set nonDuplicatesSet=new HashSet<>();
		Set duplicatesSet=new HashSet<>();
		
		for(String word:duplicates) {
			if(!nonDuplicatesSet.contains(word)) {
				nonDuplicatesSet.add(word);
			}else {
				duplicatesSet.add(word);
			}
		}
		System.out.println(duplicatesSet);
		

	}

}
