package com.test.lotto;

import java.util.Scanner;

public class UpAndDownVer3Exam { 
	public static void main(String[] args) {
	
	double sum=0;
    int[] arr= new int[100];;
    int game_count=0;
    char check= ' ';;
    int total_length=0;

    
	Scanner trynum = new Scanner(System.in);
    Scanner checkchar =new Scanner(System.in);
 while(true)			{
	 
 
    UpAndDownVer3 game =new UpAndDownVer3();
    
    System.out.println("Up & Down 게임입니다.");
    System.out.println("1부터 100까지의 숫자 중 맞춰주세요.");
   
    game.input = trynum.nextInt(); //입력받기 
    
   
    	//game.input();
    while(game.input!=game.random_num){
    		game.loop();
    		game.input=trynum.nextInt();
    		}
    
    System.out.println("정답입니다!!!");
    System.out.println("당신은" + game.count + " 번만에 정답을 맞췄습니다!!!");
    //--
    arr[game_count++] = game.count;
    game.count = 0;			// count값 초기화
    total_length = 0;
    sum = 0;			// sum값 초기화
    for(int i=0; i<arr.length ; i++) {
    	if (arr[i] > 0) {
    		sum = sum + arr[i];
    		total_length++;
    	}
    }
    //--
    System.out.println("지금까지 당신의 평균은" + (sum/(total_length)) +"번 입니다.");
    //--
    
    
    
    
    System.out.println("다시 하겠습니까?(Y/N)");
    check=checkchar.next().charAt(0);
 
    if(check=='Y' || check =='y'){
    	continue;
    }
    else if(check =='N' || check =='n')
    {
    	System.out.println("안녕히 가세요~");
        break;
    }
    else
    {
        System.out.println("손가락이 미끌어 졌나요? 잘가요");
        break;
    }
    

	}
	}
}

