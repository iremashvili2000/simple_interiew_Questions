
public class ArrayFirstOccurence {
// find the first duplicate occurrence of a number in an array?
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i[] = {1,2,3,4,5,6,1};
		int ans=0;
		for(int d=0;d<i.length;d++) {
			for(int j=d+1;j<i.length;j++) {
				if(i[d]==i[j]) {
					System.out.println(i[j]);
					ans++;
					return;
				}
			}
			
		}
		if(ans==0) {
			System.out.println("not found!");
		}
		

	}

}
