package MyStringPrograms;

import java.util.Scanner;

public class SwitchEqual {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city name");
		String name = sc.nextLine().toLowerCase().trim();
		switch(name) {
		case "hyderabad": System.out.println("Welcome in hyderabad");
		break;
		case "pune" : System.out.println("Welcome in pune");
		break;
		default : System.out.println("Enter Valid city name");
		}
	}

}
