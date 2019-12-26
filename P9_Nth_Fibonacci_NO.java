import java.util.*;

class P9_Nth_Fibonacci_NO {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int a = 0;
		int b = 0;
		int c = 1;
		do {
			if (i == n)
				System.out.print(c);
			b = c;
			c = a + b;
			a = b;
			i++;
		} while (i <= n);

	}

}
