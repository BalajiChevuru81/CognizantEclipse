package string;

public class StringExamples {
	

	public static void main(String[] args) {
		String s="hello";
		String s1=" welCoMe";
		String s2=s+s1;
		// TODO Auto-generated method stub
		System.out.println(s+s1);
		System.out.println(s2);
		System.out.println(s2.length());
		System.out.println(s2.concat(s));
		System.out.println(s2.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s.compareTo(s1));
		System.out.println((s+s1).contentEquals(s2));
		System.out.println(s.equals(s1));
		System.out.println(s.replace('h', 'H'));
		
		
	}

}
