package JavaStrings;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "SaNdEeP";
		String s1 = s.toLowerCase();
		System.out.println(s1);
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
				System.out.println(s1.charAt(i));
			}
		}

	}

}
