package MyStringPrograms;

public class StringIndex {
	public static void main(String[] args) {
		String str = "India is my country";
		char ch ='y';
		int cnt =0;
		for(int i=0;i<str.length();i++)
		{
			char charVal = str.charAt(i);
			if(ch == charVal)
				cnt++;
		}
		if(cnt==0)
			System.out.println("char "+ ch + " not found");
		else
				System.out.println("char "+ch+ " found " + cnt + " times");
	}

}
