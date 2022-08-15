
public class Test {

	public static void main(String[] args) {
		
		String s= "qwerty@#ty";
		String newString ="";
		String r = "[^a-zA-Z0-9]+";
		for (int i= 0;i <s.length();i++) {
		
			if(s.substring(i,i+1).matches(r)) {
				System.out.println(s.substring(i,i+1));
				
			}
		}

	}
}
