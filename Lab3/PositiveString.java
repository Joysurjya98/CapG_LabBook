import java.util.*;

public class PositiveString {
	
	public static boolean isPositive(String str) {
        int len = str.length();
        char temp[] = new char [len];
        for (int i = 0; i < len; i++)
            temp[i] = str.charAt(i);
        Arrays.sort(temp);
        for (int i = 0; i < len; i++) {
            if (temp[i] != str.charAt(i)) 
                return false;
        }
        return true;    
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(isPositive(s))
			System.out.println(s + " is a positive string.");
		else
			System.out.println(s + " is not a positive string.");
		sc.close();

	}

}
