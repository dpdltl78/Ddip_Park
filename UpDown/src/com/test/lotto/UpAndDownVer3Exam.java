package com.test.lotto;

public class UpAndDownVer3Exam {
	private double sum;
	private int game_count;
	private int total_length;

	UpAndDownVer3 game;

	public UpAndDownVer3Exam() {
		sum = 0;
		game_count = 0;
		total_length = 0;

	}

	public void start() {
		game = new UpAndDownVer3();
	}

	public void setInput(int input) {
		game.putNum(input);
	}

	public void calculate() {

		for (int i = 0; i < game.arr.length; i++) {
			if (game.arr[i] > 0) {
				sum = sum + game.arr[i];
				total_length++;
			}
		}
	}

	public double getAver() {
		return (sum / total_length);
	}

	public int askagain(char checkC) {

		if (checkC == 'Y' || checkC == 'y') {

			return 0;
		} else if (checkC == 'N' || checkC == 'n') {

			return 1;
		} else {
			return 2;
		}
	}

	public void countInputArr(int count) {
		game.arr[game_count++] = count;
	}
}
