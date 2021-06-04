import java.util.*;

public class ReplaceConsonants {

	public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return true;
        else
        	return false;
    }
 
    public static String alterString(String str) {
    	char[] s = str.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (isVowel(s[i])) 
            	continue;
            else {
                //if (s[i] == 'z')
                  //  s[i] = 'b';
                //else {
                    s[i] = (char) (s[i] + 1);
                  //  if (isVowel(s[i]))
                    //    s[i] = (char) (s[i] + 1);
                //}
            }
        }
        return String.valueOf(s);
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String org = sc.next();
		System.out.println(alterString(org));
		sc.close();

	}

}
