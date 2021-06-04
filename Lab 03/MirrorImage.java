import java.util.*;

public class MirrorImage {
	
	public static String getImage(String str)
    {
           StringBuffer s = new StringBuffer(str);
           s.append('|');
           StringBuffer sr = new StringBuffer(str);
           sr.reverse();
           s.append(sr);
           return s.toString();
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String original = sc.next(); 
		System.out.println(getImage(original));
		sc.close();

	}

}
