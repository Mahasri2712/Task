package Task;

public class Fibonacci_series {

	public static void main(String[] args) {
		int a=5;
		int x=0;
		int y=1;
		for(int i=0;i<a;i++) {
			System.out.println(x);
			int z=x+y;  
			x=y;
			y=z;
		}

	}

}
