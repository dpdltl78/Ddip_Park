package com.test.updowngame;

public class PlayGame extends SetElements {// 1ȸ + sum�� ���

	public PlayGame() {// ������ �ʱ�ȭ
		play_count = 0;
		game_count = 0;
		user_input = 0;
		random_num = (int) (Math.random() * 100 + 1);
		sum = 0;
		playGameStart();
	}

	void playGameStart() {// �÷��� �ʱ�ȭ
	}

	private int compareNum() {
		while (user_input != random_num) {
			if (user_input < random_num) {
				return 0;
			} else if (user_input > random_num) {
				return 1;
			} else {
			}
		}
		return 2;
	}

	public int getCompareNum() {
		return compareNum();
	}

	public void playCount() {
		play_count++;
	}

	public int getPlayCount() {
		return play_count;
	}

	public int getRandomNum() {
		return random_num;
	}

	public int getUserInput() {// private��userInput�� �˰������
		return user_input;// ���
	}

	public void setUserInput(int user_input) {// private�� userinput�� �ְ� ������
		this.user_input = user_input;
	}

	public void setAnswer(char answer) {
		this.answer = answer;
	}

	public char getAnswer() {
		return answer;
	}

	public void inputCountArr(int count) {
		arr[game_count] = count;
		game_count++;
	}

	public void addSum() {// calculate
		total_length = 0;
		sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {// i=0�� ���, sum�� 1�� ���ϴµ�, i=1�� ���, sum�� 2�� ���ϴ� ������ �߻�
				sum += arr[i];   
				total_length++;
			}
		}
		
//		System.out.println("=============");
//		System.out.println("total_length ���� "+ total_length);
//		System.out.println("i ���� "+ i);
//		System.out.println("arr["+i+"] ���� "+ arr[i]);
//		System.out.println("sum ���� "+ sum);
//		System.out.println("=============");
	}

	public double getAver() {
		avg = (sum / total_length);
		return avg;
	}

	public void resetCount() {
		play_count = 0;
		random_num = (int) (Math.random() * 10 + 1);
	}

	public void plusGameCount() {
		game_count++;
	}
}
