package practice;

public class Electricity {

	public int calculateElectricityBill(int units) {
		int bill = 0;
		if (units <= 100) {
			bill = units * 5;
		} else if (units <= 200) {
			bill = (100 * 5) + ((units - 100) * 7);
		} else {
			bill = (100 * 5) + (100 * 7) + ((units - 200) * 10);
		}
		return bill;
	}

	public static void main(String[] args) {

		Electricity e1 = new Electricity();
		int totalbill = e1.calculateElectricityBill(250);
		System.out.println("Electricity Bill : " + totalbill);

	}
}
