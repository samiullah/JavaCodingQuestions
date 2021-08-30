/**
 * 
 */

/**
 * @author sami
 *
 */
public class Print_HELLO_in_CAPITAL_letters_for_the_given_string {
	
	//2: Print HELLO in CAPITAL letters for the given string "ahceclwlxo"

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "ahceclwlxo";
		char ch[]= s.toCharArray();
		String ss="";
		
		int i =0;
		
		while(i<ch.length) {
			if(i%2!=0) {
			ss=ss+ch[i];
			}
			i++;
		}
		System.out.println(ss.toUpperCase());
		
	

	}

}
