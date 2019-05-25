
public class using_arrays {

	public static void main(String[] args) {

		int[] values;
		values = new int[3];
		
		values[0] = 9;
		values[1] = 5;
		values[2] = 3;
		
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		int[] number = {1, 4, 7, 2};
		
		for(int i=0; i<number.length; i++){
			System.out.println(number[i]);
		}
	}

}