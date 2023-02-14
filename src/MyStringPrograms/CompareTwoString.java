package MyStringPrograms;

public class CompareTwoString {
	public static boolean Compare(String s1, String s2)
	{
		boolean flag = false;
		if(s1.length() == s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i) == s2.charAt(i))
					flag = true;
				else 
					flag = false;
				break;
			}
		}
		return flag;
	}
	
	public static  void main(String []  args)
	{
		String s1 = "Mayur", s2="Mayur";
		boolean result = Compare(s1,s2);
		if(result)
			System.out.println(s1 + " and " + s2 + " are equal");
		else
			System.out.println(s1 + " and " + s2 + " are not equal");
	}
	}
	
