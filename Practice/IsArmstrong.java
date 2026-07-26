package practice;

public class Armstrong {

	public boolean Isarmstrong(int num) {
		int original = num;
		int sum = 0;

		while (num > 0) {
			int rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}
		return sum == original;

	}

	public static void main(String[] args) {

		Armstrong a1 = new Armstrong();

		if (a1.Isarmstrong(153)) {
			System.out.println("This is a Armstrong");

		} else {
			System.out.println("This is not armstrong");
		}
	}

}
