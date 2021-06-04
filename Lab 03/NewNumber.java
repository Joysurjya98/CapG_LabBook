import java.util.*;

public class NewNumber {
	
	public static int modifyNumber(int number) {
		String str = String.valueOf(number);
		StringBuffer sb = new StringBuffer();
		int n, m, diff;
		for(int i=0; i<str.length(); i++) {
			n = Integer.parseInt(String.valueOf(str.charAt(i)));
			if(i == (str.length()-1))
				sb.append(n);
			else {
			m = Integer.parseInt(String.valueOf(str.charAt(i+1)));
			diff = Math.abs(n-m);
			sb.append(diff);
			}
		}
		return Integer.parseInt(sb.toString());
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(modifyNumber(num));
		sc.close();
	}

}
