import java.util.*;

class P10_Count_digits_in_a_number {

	public static void main(String[] args) {
		System.out.println("Enter a No");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int c = 0;
		while (i != 0) {
			i = i / 10;
			c += 1;
		}
		System.out.println("The Lenght Of YOUR NO IS " + c);

	}

}
