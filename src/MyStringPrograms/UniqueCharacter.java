package MyStringPrograms;

public class UniqueCharacter {
	public static void main(String[] args) {
		String str="India is my country";
		int cnt,cnt1;
		for(char c='a',c1='A';c<='z'&& c1<='Z';c++,c1++)
		{
			cnt=0;
			cnt1=0;
			for(int i=0;i<str.length();i++)
			{
				if(c==str.charAt(i))
					cnt++;
				if(c1==str.charAt(i))
					cnt1++;
			}
			if(cnt==1)
				System.out.println("char "+c+" is unique");
			if(cnt1==1)
				System.out.println("char "+c1+" is unique");
		}
	}

}
