package MyStringPrograms;

public class IndexOf {

	public static void main(String[] args) {
		String s = "New Delhi is capital of India";
		System.out.println(s.indexOf('i'));
		int first = s.indexOf('a');
		int second = s.indexOf('a',first+1);
		System.out.println(second);
		
		int lastIndex = s.lastIndexOf('i');
		System.out.println("Last Index " + lastIndex);
		int secondlast = s.lastIndexOf('i',lastIndex-1);
		System.out.println(secondlast);
	}

}
