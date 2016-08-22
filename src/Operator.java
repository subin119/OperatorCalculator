
public class Operator {

	private int numberOne, numberTwo;

	public int getNumberOne() {
		return numberOne;
	}

	public void setNumberOne(int numberOne) {
		this.numberOne = numberOne;
	}

	public int getNumberTwo() {
		return numberTwo;
	}

	public void setNumberTwo(int numberTwo) {
		this.numberTwo = numberTwo;
	}

	public int add(int numberOne, int numberTwo) {
		int result = numberOne + numberTwo;
		return result;
	}

	public int sub(int numberOne, int numberTwo) {
		int result = numberOne - numberTwo;
		return result;
	}

	public int mult(int numberOne, int numberTwo) {
		int result = numberOne * numberTwo;
		return result;
	}

	public int div(int numberOne, int numberTwo) {
		int result = numberOne / numberTwo;
		return result;
	}
}
