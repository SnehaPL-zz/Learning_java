
public class arrayOfString {

	public static void main(String[] args) {

		String[] text = new String[3];
		
		text[0] = "Hello";
		text[1] = "Sneha";
		text[2] = "Patil";
		
		System.out.println(text[1]);
		
		String[] fruits = {"apple", "pear", "kiwi", "banana"};
		
		for(String fruit: fruits){
			System.out.println(fruit);
		}
	}

}
