package MyStringPrograms;

public class DuplicateOrNot {
	public static void main(String[] args) {
		String str = "India is my country";
		char c ='a';
		int cnt = 0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(c == ch)
				cnt++;
		}
		if(cnt>1) {
			System.out.println("char "+c+" "+"duplicated "+cnt+" times");
		}
		else if(cnt ==0) {
			System.out.println("char "+c+" not found");
		}else {
			System.out.println("char "+c+ " not duplicate");
		}
			
	}

}
