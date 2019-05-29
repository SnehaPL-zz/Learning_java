
class Thing{
	public String name;
	public static String description;
	
	public final static int FINAL_VALUE=24;
	
	public void showName(){
		System.out.println(description+ " : " +name);
	}
	
	public static void showInfo(){
		System.out.println(description);
	}
}

public class usingStatic {

	public static void main(String[] args) {

		Thing.description = "Hello";
		Thing.showInfo();
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name = "Sneha";
		thing2.name = "Asmi";
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(Thing.FINAL_VALUE);
	}

}
