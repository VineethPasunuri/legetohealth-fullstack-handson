package Day3;

public class Car implements Vehicle1 {
	private int manufacturedYear;

	public int getManufacturedYear() {
		return manufacturedYear;
	}

	public void setManufacturedYear(int manufacturedYear) {
		this.manufacturedYear = manufacturedYear;
	}

	@Override
	public void mileage() {
		System.out.println("25 kmpl");

	}

	@Override
	public void wheels() {
		System.out.println("Has 4 wheels");

	}

}
