package Day3;

public class Swift extends Car implements Vehicle1, Vehicle2 {
	private int carNumber;

	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	@Override
	public void mileage() {
		System.out.println("22 kmpl");
	}

	@Override
	public void wheels() {
		System.out.println("4 wheels");

	}

	@Override
	public void speed() {
		System.out.println("100kmph");

	}

}
