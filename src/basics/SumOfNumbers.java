package basics;

public class SumOfNumbers {
		
	public static void main(String[] args) {
int[] intAry = {1, 2, 3};
	System.out.println(intAry);
	System.out.println(sum(intAry));
	}
			public static int sum(int[] numbers) {

				int sum = 0;
				for (int i = 0; i < numbers.length; i++) {
					sum = sum + numbers[i];
				}
				return sum;
			}

	

}
