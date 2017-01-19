package com.test.updowngame;

public class PlayGame extends SetElements {// 1회 + sum도 계산

	public PlayGame() {// 게임을 초기화
		play_count = 0;
		game_count = 0;
		user_input = 0;
		random_num = (int) (Math.random() * 100 + 1);
		sum = 0;
		playGameStart();
	}

	void playGameStart() {// 플레이 초기화
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

	public int getUserInput() {// private한userInput을 알고싶을때
		return user_input;// 출력
	}

	public void setUserInput(int user_input) {// private한 userinput을 넣고 싶을때
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
			if (arr[i] > 0) {// i=0일 경우, sum을 1번 더하는데, i=1일 경우, sum을 2번 더하는 오류가 발생
				sum += arr[i];   
				total_length++;
			}
		}
		
//		System.out.println("=============");
//		System.out.println("total_length 값은 "+ total_length);
//		System.out.println("i 값은 "+ i);
//		System.out.println("arr["+i+"] 값은 "+ arr[i]);
//		System.out.println("sum 값은 "+ sum);
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
