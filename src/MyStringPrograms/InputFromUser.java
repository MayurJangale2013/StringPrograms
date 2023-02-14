package MyStringPrograms;
import java.util.Scanner;
public class InputFromUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String s1 = sc.nextLine();
		System.out.println("Enter second String");
		String s2 = sc.nextLine();
		boolean flag = false;
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		if(s1.length() == s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i) == s2.charAt(i))
					flag= true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(s1 + " and " + s2 + " are equal");
		}
		else
		{
			System.out.println(s1 + " and " + s2 + " are not equal");
		}
	
	}

}
