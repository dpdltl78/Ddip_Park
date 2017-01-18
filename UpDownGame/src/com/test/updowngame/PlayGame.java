package com.test.updowngame;

public class PlayGame {// 1회 + sum도 계산
	private int play_count;
	private int game_count;
	
	private int user_input;
	private int random_num;
	private char answer;
	static int[] arr = new int[100];
	
	private int sum;
	private int total_length=0;

    
	public PlayGame() {// 게임을 초기화
		play_count = 0;
		user_input = 0;
		random_num = (int) (Math.random() * 10 + 1);
		sum=0;
		playGameStart();
	}

	
	void playGameStart(){//플레이 초기화
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
	
	public int getCompareNum(){
		return compareNum();
	}
	
	public void playCount(){
		play_count++;
	}
	
	public int getPlayCount(){
		return play_count;
	}
	
	public int getRandomNum(){
		return random_num;
	}
	
	public int getUserInput(){//private한userInput을 알고싶을때
		return user_input;//출력
	}
	
	public void setUserInput(int user_input){//private한 userinput을 넣고 싶을때
		this.user_input=user_input;
	}
	
	
	public void setAnswer(char answer){
		this.answer = answer;
	}
	
	public char getAnswer(){
		return answer;
	}
	
	public void inputCountArr(int count){
		arr[play_count] = count;
		play_count++;
	}

	public void addSum(){//calculate
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] > 0){
				sum += arr[i];
				total_length++;
			}
		}
	}
	
	public double getAver(){
		return (sum/game_count);
	}
	
	public void resetCount() {
		play_count = 0;
		random_num = (int) (Math.random() * 10 + 1);
	}
	public void plusGameCount(){
		game_count++;
	}
}
