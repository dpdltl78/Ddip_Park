package com.test.updowngame;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class PlayGame extends SetElements implements Serializable{// 1회 + sum도 계산

	public static void save(PlayGame playGame, String filename){
		try{
			
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(playGame);
			oos.flush(); oos.close(); fos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static PlayGame load(String filename){
		PlayGame playGame=null;
		try{
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);
			playGame = (PlayGame)ois.readObject();
			ois.close(); fis.close();
		}catch(Exception e){e.printStackTrace();}
		return playGame;
	}
	///---
	
	
	
	public PlayGame() {// 게임을 초기화
		play_count = 0;
		game_count = 0;
		user_input = 0;
		random_num = (int) (Math.random() * 10 + 1);
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
