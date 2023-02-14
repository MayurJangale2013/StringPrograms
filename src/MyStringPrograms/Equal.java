package MyStringPrograms;

import java.util.Scanner;

public class Equal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter city name");
			String name = sc.next().toLowerCase().trim();
			if(name.equals("hyderabad"))
			{
				System.out.println("Welcome to Hyderabad");
			}
			else if(name.equals("banglore"))
			{
				System.out.println("Welcome to Banglore");
			}
			else if(name.equals("pune"))
			{
				System.out.println("Welcome to Pune");
			}
			else
			{
			System.out.println("Enter valid city name");
			}
		
		}
	}


