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
				System.out.println("�ε尡 �Ϸ� �Ǿ����ϴ�.");
				System.out.println("�������."+ playGame.getPlayCount()+ "�� �ߴ� �÷��̾ ���̱���.");				
				playGame.playGameStart();
			} else if(play_before==true)
				{ continue;	}
			else{	
				playGame = new PlayGame();
			}
			
			//--
			System.out.println("����������������������������������");
			System.out.println("��               ��");
			System.out.println("��   UP & DOWN   ��");
			System.out.println("��               ��");
			System.out.println("��    G A M E    ��");
			System.out.println("��               ��");
			System.out.println("��   S T A R T   ��");
			System.out.println("��               ��");
			System.out.println("����������������������������������");
//			System.out.println("Up & Down �����Դϴ�.\n");
			System.out.println("1���� 100���� ���� �� �����ּ���.");
			
			playGame.setUserInput(try_num.nextInt());
			playGame.playCount(); //�õ�Ƚ�� �߰�
			
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
				playGame.playCount();//�õ�Ƚ�� �߰�
			}
			System.out.println("�����Դϴ�.\n����� "+playGame.getPlayCount() +"�� ���� ������ϴ�.");
		
			playGame.inputCountArr(playGame.getPlayCount());
			
			playGame.addSum();
			System.out.println("���ݱ��� ����� ����� "+ playGame.getAver() +"�� �Դϴ�.");
			System.out.println("�� �� �� �÷��� �Ͻðڽ��ϱ�? (Y/N)");
			playGame.plusGameCount();
			
			char exitChar = check_char.next().charAt(0);
			if (exitChar == Yes || exitChar == yes) {
				is_game_finished = true;
				playGame.resetCount();
			} else if (exitChar == No || exitChar == no) {
				is_game_finished = false;
				System.out.println("�ȳ��� ������~");
			} else if (exitChar == 'S' || exitChar == 's') {
				is_game_finished = false;
				//playGame.set_before();
				//playGame.plus_save();
				
				playGame.save(playGame,"test.dat");
				
				System.out.println("�÷��� ������ �Ϸ�Ǿ����ϴ�. �ȳ��� ���ʽÿ�.");
				play_before=true;
			
			}
			else {
				is_game_finished = false;
				System.out.println("�հ����� �̲���������? ������ ������~");
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
