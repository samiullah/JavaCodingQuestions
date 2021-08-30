
public class Print_HELLO_for_the_given_string {
	
	//1: Print HELLO for the given string 1: Print HELLO for the given string "AHCECLWLXO"
	
	public static void main(String[] args) {
		
		
		String s = "AHCECLWLXO";
		char[] ch = s.toCharArray();
			
		int i =0;
		
		while(i<10) {
			
			if(i%2!=0) {
				System.out.print(ch[i]);
			}
			i++;
		}
		
	
	}

}
