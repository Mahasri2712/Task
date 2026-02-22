package Task;
import java.util.*;
public class String_Reverse {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String a=obj.next();
		String reverse_Str="";
		for(int i=a.length()-1;i>=0;i--) {
			reverse_Str+=a.charAt(i);
		}
		System.out.println(reverse_Str);
		if(a.equals(reverse_Str)) {
			System.out.println("It is palindrom");
		}
		else {
			System.out.println("It is not a Palindrom");
		}
		

	}

}
