import java.util.*;
class P11_Reverse_a_no {

	public static void main(String[] args) {
		System.out.println("Enter a No");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i,c=0;
		while(n!=0) {
			i=n%10;
			c=(10*c)+i;
			n=n/10;
			
		}
		System.out.println("Reverse Of Your no is "+c);

	}

}
