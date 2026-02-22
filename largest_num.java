package Task;
public class largest_num {
	public static void main(String[] args) {
		int a[]= {12,3,4,5,7};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
				if(a[i]>max) {
					max=a[i];
				}
			}
		System.out.println(max);
	}
}
