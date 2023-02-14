package MyStringPrograms;

public class Compare2String {

	public static void main(String[] args) {
		String s1 = "Mayur";
		String s2 = "Mayur";
		boolean flag = false;
		if(s1.length() == s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i) == s2.charAt(i))
					flag = true;
			}	
		}
		if(flag)
			System.out.println(s1 + " and " + s2 + " are equal");
		else
			System.out.println(s1 + " and " + s2 + " are not equal");
	}
}
