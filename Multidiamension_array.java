
public class Multidiamension_array {

	public static void main(String[] args) {

		//one dimensional array
		int[] num = {5,9,1};
		System.out.println(num[1]);
		
		//two dimensional array
		int[][] values = {
				{3, 5, 9},
				{7, 3},
				{4, 6, 1, 8}
		};
		
		for(int row=0; row<values.length; row++){
			for(int col=0; col<values[row].length; col++){
				System.out.print(values[row][col] + "\t");
			}
			System.out.println();
		}
		
		String[][] text ={
				{"hello", "sneha"},
				{"hi", "Asmi"},
				{"samarth", "sawant"}
		};
		System.out.println(text[1][1]);
		

	}

}
