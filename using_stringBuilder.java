
public class using_stringBuilder {

	public static void main(String[] args) {

		StringBuilder sd = new StringBuilder("");
		
		sd.append("My name is Sneha.");
		sd.append(" ");
		sd.append("My age is 28.");
		
		System.out.println(sd);
		
		StringBuilder s = new StringBuilder("");
		
		s.append("My name is Asmi.").append(" ").append("My age is 2.");
		
		System.out.println(s);
	}

}
