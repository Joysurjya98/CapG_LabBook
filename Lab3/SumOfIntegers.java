import java.util.*;

public class SumOfIntegers {

	public static void main(String[] args) {
		int sum = 0, digit;
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s);
		while(st.hasMoreTokens()) {			
			digit = Integer.parseInt(st.nextToken());
			System.out.println(digit);
			sum += digit;
		}
		System.out.println("The sum is: " + sum);
		sc.close();

	}

}
