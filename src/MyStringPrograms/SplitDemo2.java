package MyStringPrograms;

public class SplitDemo2 {

	public static void main(String[] args) {
		String str = "Java is Awesome";
		String [] tokens = str.split(" ");
		for(int i=tokens.length-1;i>=0;i--)			
		{
			System.out.println(tokens[i]);
		}
		System.out.println(tokens.length);
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
			
	}

}
