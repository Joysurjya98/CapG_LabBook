import java.util.Scanner;

public class Sumdivby35 {
	
	public static int calculateSum(int n) {
		int sum = 0, i=1;
		while(n > 0) {
			if(i%3 == 0 || i%5 == 0) {
				sum += i;
				n--;
			}
			i++;
		}
		return sum;
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("Sum of first " + num + " numbers which are divisible by 3 or 5 is: " + calculateSum(num));
		sc.close();

	}

}
