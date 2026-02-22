package Task;
import java.util.*;
public class Reverse_num {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=obj.nextInt();
		int y=0;
		while(a>0) {
			int z=a%10;
			a=a/10;
			y=y*10+z;
		}
		System.out.println(y);
	}

}
