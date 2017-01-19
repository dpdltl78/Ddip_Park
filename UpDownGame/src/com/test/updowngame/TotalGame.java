package com.test.updowngame;

import java.util.Scanner;

public class TotalGame {
	final static int Up = 0;//static
	final static int Down = 1; 
	
	final static char Yes = 'Y';
	final static char yes = 'y';
	final static char No = 'N';
	final static char no = 'n';	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner try_num = new Scanner(System.in);
		Scanner check_char = new Scanner(System.in);
		PlayGame PlayGame = new PlayGame();
		
		boolean is_game_finished;
		
		
		do {
			System.out.println("Up & Down �����Դϴ�. \n 1���� 100���� ���� �� �����ּ���.");
			
			PlayGame.setUserInput(try_num.nextInt());
			PlayGame.playCount(); //�õ�Ƚ�� �߰�
			
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
				PlayGame.playCount();//�õ�Ƚ�� �߰�
			}
			System.out.println("�����Դϴ�.\n����� "+PlayGame.getPlayCount()
			+"�� ���� ������ϴ�.");
		
			PlayGame.inputCountArr(PlayGame.getPlayCount());
			
			PlayGame.addSum();
			System.out.println("���ݱ��� ����� ����� "+ PlayGame.getAver() 
			+"�� �Դϴ�.");
			System.out.println("�� �� �� �÷��� �Ͻðڽ��ϱ�? (Y/N)");
			PlayGame.plusGameCount();
			
			PlayGame.setAnswer(check_char.next().charAt(0));
			if(PlayGame.getAnswer() == Yes || PlayGame.getAnswer() == yes) {
				is_game_finished = true;
				PlayGame.resetCount();
			} else if (PlayGame.getAnswer() == No || PlayGame.getAnswer() == no) {
				is_game_finished = false;
				System.out.println("�ȳ��� ������~");
			} else {
				is_game_finished = false;
				System.out.println("�հ����� �̲���������? ������ ������~");
			}
		} while(is_game_finished);
	}//main
}//Total Game
