package MyStringPrograms;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Name");
//		String str = sc.nextLine();
		String StrRev = "";
//			for(int i=str.length()-1;i>=0;i--)
//			StrRev = StrRev + str.charAt(i);
//			System.out.print(str.charAt(i));
		String str = "Aurangabad";
		for(int i=str.length()-1;i>=0;i--)
		{
			StrRev = StrRev + str.charAt(i);
	
		}
		System.out.print(StrRev);
		System.out.println("");
		System.out.println(StrRev.charAt(2));
		System.out.println(str.indexOf('u'));
	}

}
