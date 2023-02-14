package MyStringPrograms;

public class ToLowerCase {

	public static void main(String[] args) {
		String str1 = "Java is Awesome";
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		String [] tokens = str1.split(" ");
		for(int i=0;i<tokens.length;i++)
		{
			System.out.println(tokens[i]);
		}
		System.out.println("=".repeat(40));
		
	}

}
