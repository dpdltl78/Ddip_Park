package com.test.updowngame;

import java.util.Scanner;

public class TotalGame {
	static int Up = 0;//static
	static int Down = 1; 
	
	static char Yes = 'Y';
	static char yes = 'y';
	static char No = 'N';
	static char no = 'n';	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner try_num = new Scanner(System.in);
		Scanner check_char = new Scanner(System.in);
		PlayGame PlayGame = new PlayGame();
		
		boolean is_game_finished;
		
		
		do {
		System.out.println("Up & Down 게임입니다. \n 1부터 100까지 숫자 중 맞춰주세요.");
		
		PlayGame.setUserInput(try_num.nextInt());
		PlayGame.playCount(); //시도횟수 추가
		
		while(PlayGame.getRandomNum()!=PlayGame.getUserInput()){
			if(PlayGame.getCompareNum()== Up ){
				System.out.println("Up!!!!!");
				
			}
			else if(PlayGame.getCompareNum()==Down){
				System.out.println("Down!!!!!");
			}
			else{
				continue;
			}
			PlayGame.setUserInput(try_num.nextInt());
			PlayGame.playCount();//시도횟수 추가
	}
		System.out.println("정답입니다.\n당신은 "+PlayGame.getPlayCount()
		+"번 만에 맞췄습니다.");
		
			PlayGame.inputCountArr(PlayGame.getPlayCount());
			
			PlayGame.addSum();
			System.out.println("지금까지 당신의 평균은 "+ PlayGame.getAver() 
			+"번 입니다.");
			System.out.println("한 번 더 플레이 하시겠습니까? (Y/N)");
			PlayGame.plusGameCount();
			
			PlayGame.setAnswer(check_char.next().charAt(0));
			if(PlayGame.getAnswer() == Yes || PlayGame.getAnswer() == yes) {
				is_game_finished = true;
				PlayGame.resetCount();
			} else if (PlayGame.getAnswer() == No || PlayGame.getAnswer() == no) {
				is_game_finished = false;
				System.out.println("안녕히 가세요~");
			} else {
				is_game_finished = false;
				System.out.println("손가락이 미끄러졌나요? 조심히 가세요~");
			}
	} while(is_game_finished);
}//main
}//Total Game
