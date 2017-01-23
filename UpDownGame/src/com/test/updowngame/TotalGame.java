package com.test.updowngame;

import java.util.Scanner;

public class TotalGame {
	final static int Up = 0;
	final static int Down = 1; 
	final static char Yes = 'Y';
	final static char yes = 'y';
	final static char No = 'N';
	final static char no = 'n';	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner try_num = new Scanner(System.in);
		Scanner check_char = new Scanner(System.in);
//		PlayGame playGame = new PlayGame();

		boolean play_before=false;
		PlayGame playGame = null;//new PlayGame();	
		boolean is_game_finished=true;
		
		
		do {
			
			playGame = playGame.load("test.dat");
			
			if (playGame != null&& play_before==false) {
				System.out.println("로드가 완료 되었습니다.");
				System.out.println("어서오세요."+ playGame.getPlayCount()+ "번 했던 플레이어가 오셨군요.");				
				playGame.playGameStart();
			} else if(play_before==true)
				{ continue;	}
			else{	
				playGame = new PlayGame();
			}
			
			//--
			System.out.println("┌───────────────┐");
			System.out.println("│               │");
			System.out.println("│   UP & DOWN   │");
			System.out.println("│               │");
			System.out.println("│    G A M E    │");
			System.out.println("│               │");
			System.out.println("│   S T A R T   │");
			System.out.println("│               │");
			System.out.println("└───────────────┘");
//			System.out.println("Up & Down 게임입니다.\n");
			System.out.println("1부터 100까지 숫자 중 맞춰주세요.");
			
			playGame.setUserInput(try_num.nextInt());
			playGame.playCount(); //시도횟수 추가
			
			while(playGame.getRandomNum()!=playGame.getUserInput()){
				if(playGame.getCompareNum()== Up ){
					System.out.println("Up!!!!!");
					
				}
				else if(playGame.getCompareNum()==Down){
					System.out.println("Down!!!!!");
				}
				else{
					continue;
				}
				playGame.setUserInput(try_num.nextInt());
				playGame.playCount();//시도횟수 추가
			}
			System.out.println("정답입니다.\n당신은 "+playGame.getPlayCount() +"번 만에 맞췄습니다.");
		
			playGame.inputCountArr(playGame.getPlayCount());
			
			playGame.addSum();
			System.out.println("지금까지 당신의 평균은 "+ playGame.getAver() +"번 입니다.");
			System.out.println("한 번 더 플레이 하시겠습니까? (Y/N)");
			playGame.plusGameCount();
			
			char exitChar = check_char.next().charAt(0);
			if (exitChar == Yes || exitChar == yes) {
				is_game_finished = true;
				playGame.resetCount();
			} else if (exitChar == No || exitChar == no) {
				is_game_finished = false;
				System.out.println("안녕히 가세요~");
			} else if (exitChar == 'S' || exitChar == 's') {
				is_game_finished = false;
				//playGame.set_before();
				//playGame.plus_save();
				
				playGame.save(playGame,"test.dat");
				
				System.out.println("플레이 저장이 완료되었습니다. 안녕히 가십시오.");
				play_before=true;
			
			}
			else {
				is_game_finished = false;
				System.out.println("손가락이 미끄러졌나요? 조심히 가세요~");
			}
		} while(is_game_finished);
	}//main
}//Total Game

/*
			playGame.setAnswer(check_char.next().charAt(0));
			if(playGame.getAnswer() == Yes || playGame.getAnswer() == yes) {
				
			} else if (playGame.getAnswer() == No || playGame.getAnswer() == no) {
				
			} else {
				
			}
*/
