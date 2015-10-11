import java.util.Arrays;
public class JavaLessonNine{
	public static void main(String[] args){
		int[] randomArray;

		int[] numberArray = new int[10];

		randomArray = new int[20];
		randomArray[1] = 2;

		String[] stringArray = {"just","random","words"};

		for(int i = 0; i < numberArray.length; i++){
			numberArray[i]=i;
		}
		int k = 1;
		while(k <= 41){System.out.print('-');k++;}
		System.out.println();

		for(int j = 0; j < numberArray.length; j++){
			System.out.print("| "+j+" ");
		}
		System.out.println("|");

			// make the array
		String[][] multiArrayX = new String[10][10];

		for(int i = 0; i <multiArrayX.length; i++){
			for(int j=0; j<multiArrayX[i].length; j++){
				multiArrayX[i][j]= i +""+j;
			}
			// print the array
		}
		for(int i = 0; i <multiArrayX.length; i++){
			for(int j=0; j<multiArrayX[i].length; j++){
				System.out.print("| "+multiArrayX[i][j]+"");
			}
			System.out.println(" ");
		}

		int[] numberCopy = Arrays.copyOf(numberArray,5);
		for (int row : numberCopy){
			System.out.print(row);
		}
		System.out.println("\n");
	}
} 