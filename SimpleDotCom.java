public class SimpleDotCom {
	int[] locationCell;
	int number = 0;

	public void setLocation(int[] location) {
		locationCell = location;
	}

	public String checkyourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);

		String result = "miss";

		for (int cell : locationCell) {
			if (cell == guess) {
				result = "hit";
				number++;
				break;
			}
		}
		if (number == locationCell.length) {
			result = "kill";
		}

		return result;
	}
}
