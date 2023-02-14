package StringBuilderAndBuffer;

public class StringBufferBuilderDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Pune");
		System.out.println("className: " + sb.getClass().getName());
		sb.append(" Mumbai");
		System.out.println(sb);
		sb.insert(1, "oo");
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer("Hello"); 
	     sb1.replace(1,3,"Java"); //replaces 1 and 2 excluding 3 last index
        System.out.println(sb1);
        sb1.delete(1,3); ///exclude 3
        System.out.println(sb1);
        
        System.out.println(sb1.reverse());
        
	}

}
