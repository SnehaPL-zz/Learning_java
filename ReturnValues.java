
class newPerson{
	String name;
	int age;
	
	int calculateAgeToRetirement(){
		
		int ageLeft = 58 - age;
		return ageLeft;
		
	}
}

public class ReturnValues {

	public static void main(String[] args) {

		newPerson Person1 = new newPerson();
		Person1.name = "Sneha";
		Person1.age = 28;
		
		int yearsLeft = Person1.calculateAgeToRetirement();
		
		System.out.println("Years Left for Retirement is "+ yearsLeft+".");
	}

}
