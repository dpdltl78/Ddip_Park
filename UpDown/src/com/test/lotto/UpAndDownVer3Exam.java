package com.test.lotto;

import java.util.Scanner;

public class UpAndDownVer3Exam {
	double sum;
	int game_count;
	char check;
	int total_length;
	String print;
	boolean loop_check;
	 int[] aary= new int[100];

	Scanner trynum = new Scanner(System.in);
	Scanner checkchar = new Scanner(System.in);
	UpAndDownVer3 game = new UpAndDownVer3();

	
	public UpAndDownVer3Exam(){
		sum = 0;
		game_count =0;
		check = ' ';
		total_length =0;
		loop_check=false;
			
	}


String start(){

	print = "Up & Down 게임입니다.\n1부터 100까지의 숫자 중 맞춰주세요.";
	game = new UpAndDownVer3();
	return print;
}

void input(){
	game.input=trynum.nextInt();
}

String loopinput(){
	
	while(game.loop()!=2){
		game.input = trynum.nextInt();
		game.count();
		if(game.loop()==0)
		{
			return "Up";
		}
		else if(game.loop()==1)
		{
			return "Down";
		}
		else 
			
			continue;
	}
	
	print="정답입니다!!!\n당신은 " + game.count + " 번만에 정답을 맞췄습니다!!!";
	//loop_check=true;
	game.aary[game_count++]=game.count;
	return print;
//			// --
}

void reset_count(){
//	game.count = 0; // count값 초기화
//	total_length = 0;
//	sum = 0; // sum값 초기화
}

String calculate(){
	for (int i = 0; i < game.aary.length; i++) {
	if (game.aary[i] > 0) {
		sum = sum + game.aary[i];
		total_length++;
		}	
	}
	print="지금까지 당신의 평균은" + sum/(total_length) + "번 입니다. \n다시 하시겠습니까?(Y/N)";
	
	return print;
}	

boolean askagain(){
	check = checkchar.next().charAt(0);
	if (check == 'Y' || check == 'y') {
	
		return true;
	} else if (check == 'N' || check == 'n') {
		print="안녕히 가세요~";
		return false;
	} else {
		print="손가락이 미끌어 졌나요? 잘가요";
		return false;
	}
}
//}
	
//		while (true) {
//
//			UpAndDownVer3 game = new UpAndDownVer3();
//
//			System.out.println("Up & Down 게임입니다.");
//			System.out.println("1부터 100까지의 숫자 중 맞춰주세요.");
//
//			game.input = trynum.nextInt(); // 입력받기
//
//			while (!game.loop()) {
//				game.input = trynum.nextInt();
//			}
//
//			System.out.println("정답입니다!!!");
//			System.out.println("당신은" + game.count + " 번만에 정답을 맞췄습니다!!!");
//			// --
//			arr[game_count++] = game.count;
//			game.count = 0; // count값 초기화
//			total_length = 0;
//			sum = 0; // sum값 초기화
//			for (int i = 0; i < arr.length; i++) {
//				if (arr[i] > 0) {
//					sum = sum + arr[i];
//					total_length++;
//				}
//			}
//			// --
//			System.out.println("지금까지 당신의 평균은" + (sum / (total_length)) + "번 입니다.");
//			// --
//
//			System.out.println("다시 하겠습니까?(Y/N)");
//			check = checkchar.next().charAt(0);
//
//			if (check == 'Y' || check == 'y') {
//				continue;
//			} else if (check == 'N' || check == 'n') {
//				System.out.println("안녕히 가세요~");
//				break;
//			} else {
//				System.out.println("손가락이 미끌어 졌나요? 잘가요");
//				break;
//			}
		}

