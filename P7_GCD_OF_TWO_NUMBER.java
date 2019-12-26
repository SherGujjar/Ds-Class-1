import java.util.*;

class P7_GCD_OF_TWO_NUMBER {

	public static void main(String[] args) {
		System.out.println("enter two no");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = 1;
		int i = 2;
		if (a > b) {
			if (a % b == 0) {
				c = b;
				System.out.println("GCD OF THESE NO ARE " + c);
				return;
			} else {
				while (i < b) {
					if (b % i == 0 && a % i == 0) {
						b = b / i;

						a = a / i;
						c = c * i;

					} else if (b % i != 0 || a % i != 0)
						i++;

				}
				System.out.println("GCD Of THESE NO are " + c);
			}
		} else {
			if (b % a == 0) {
				c = a;
				System.out.println("GCD OF THESE NO ARE " + c);
				return;
			} else {
				while (i < a) {
					if (b % i == 0 && a % i == 0) {
						a = a / i;

						b = b / i;
						c = c * i;

					} else if (b % i != 0 || a % i != 0)
						i++;

				}

				System.out.println("GCD Of THESE NO are" + c);
			}
		}

	}

}
