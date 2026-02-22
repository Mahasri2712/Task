package Task;
import java.util.*;
public class vowels {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the String");
		String a=obj.nextLine();
		int count=0;
		for(int i=0;i<a.length();i++) {
			char b=a.charAt(i);
			if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u') {
				count++;
			}
		}
		System.out.println(count);
	}
}
