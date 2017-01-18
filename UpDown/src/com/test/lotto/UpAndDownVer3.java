package com.test.lotto;

public class UpAndDownVer3 {
	private int count;
	private int input;
	private final int random_num;
	private char c;
	static int[] arr = new int[100];

	public UpAndDownVer3() {
		count = 0;
		input = 0;
		random_num = (int) (Math.random() * 100 + 1);
	}

	public int loop() {
		while (input != random_num) {
			if (input < random_num) {
				return 0;
			} else if (input > random_num) {
				return 1;
			} else {
			}
		}
		return 2;
	}

	public void plusCount() {
		count++;
	}

	public int getRanNum() {
		return random_num;
	}

	public int getInput() {
		return input;
	}

	public int getCount() {
		return count;
	}

	public void putC(char input) {
		c = input;
	}

	public char getC() {
		return c;
	}

	public void putNum(int num) {
		this.input = num;
	}
}
