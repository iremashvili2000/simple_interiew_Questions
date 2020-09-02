import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DisplayDuplicateCharactersDemo {
// mocemuli kodi tvilis ramdenjer gvxvdeba esa tu is aso ogond romlebic 1 ze metjer gvxvdebian))))
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ans=new Scanner(System.in);
		String str=ans.next();
		displayDuplicates(str);
		

	}
	
public static void	displayDuplicates(String str){
	Map<Character,Integer> map=new HashMap<>();
	char [] characters=str.toCharArray();
	
	for(char c:characters) {
		if(!map.containsKey(c)) {
			map.put(c,1);// tu ar aris am asos gasagebi sheqmnis da 1 dauwers integershi
		}else {
			map.put(c,map.get(c)+1);// tu aris 1 gazrdis da mase chawers
			
		}
		
	}
		Set<Map.Entry<Character,Integer>> entrySet=map.entrySet();
		for(Map.Entry<Character,Integer> entry:entrySet) {
			if(entry.getValue()>1) {
				System.out.printf("%s : %d %n",entry.getKey(),entry.getValue());
			}
		}
	
	
	
		
	}

}
