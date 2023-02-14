package StringBuilderAndBuffer;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sbld1 = new StringBuilder("My");
		sbld1.append("Java");
		System.out.println(sbld1);
		
		StringBuilder sbld2 = new StringBuilder(10);
		sbld2.append("Hello");
		System.out.println(sbld2);
		System.out.println("sbld2.capacity()=>"+ sbld2.capacity()); //default is 16 characters
	
	}

}
