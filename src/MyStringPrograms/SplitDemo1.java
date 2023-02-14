package MyStringPrograms;

public class SplitDemo1 {

	public static void main(String[] args) {
		String str = "Java is Awesome, and we are learning since a month and it should finish by Dec";
		String [] tokens = str.split("and");
		for(int i=0;i<tokens.length;i++)
		{
			System.out.println(tokens[i]);
		}
	}

}
