import java.util.*;

public class P6_all_prime_till_n {

	public static void main(String[] args) {
		System.out.println("Enter a no");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int j;
		int i;
		for (i = 2; i <= a; i++) {

			for (j = 2; j < i; j++) {

				if (i % j == 0) {
					break;
				}
			}
			if (i == j)
				System.out.println(i);

		}

	}

}
