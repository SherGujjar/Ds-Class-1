import java.util.*;
class P8_all_fibonacci_number {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = 0;
		int b = 0;
		int c = 1;
		do {
			System.out.print(c + " ");
			b = c;
			c = a + b;
			a = b;
		} while (c < n);

	}

}
