package com.test.lotto;

import java.util.Scanner;



public class UpAndDown_Ver2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in); // 문제맞추기를 시도하는 숫자
        Scanner c = new Scanner(System.in); // 다시
    	int count=0;
    	double sum=0;
        
        System.out.println("                  | | | | | | | | | | |");
        System.out.println("              | |                       | | ");
        System.out.println("            |                               |");
        System.out.println("          |                                   | ");
        System.out.println(" 	 |              UP & DOWN              |");
        System.out.println("        | |                                   | |");
        System.out.println("        |   |                               |   |");
        System.out.println("        |     | |                       | |     |");
        System.out.println("        |         | | | | | | | | | | |         |");             
        System.out.println("        |                                       |");
        System.out.println("        |                                       |");
        System.out.println("         |               좋은데이                    | ");
        System.out.println("          |                                   |  ");
        System.out.println("            |                               |");
        System.out.println("              | |                       | |");
        System.out.println("                  | | | | | | | | | | | ");
  
        int[] arr = new int[100];
        int game_count = 0;
        
        
    while(true)
    {
        int num = (int) (Math.random()*100 + 1);
        System.out.println("Up & Down 게임입니다.");
        System.out.println("1부터 100까지의 숫자 중 맞춰주세요.");
        int input = 0;
        char check;

        while(input!=num)
        {
            input = s.nextInt(); //입력받기
            while(true)
            {
            	count++;
            	if(input<num)    
            	{
            		System.out.println("UP!!!!");
            		System.out.println("화면에 숫자를 한 번 더 입력하세요.");
            		break;
	        	}
	        	else if(input>num)
	        	{
	        		System.out.println("DOWN!!!!"); 
        		  	System.out.println("화면에 숫자를 한 번 더 입력하세요.");
        		  	break;
	        	}
	        	else 
	        	{
	        		break;
	        	}
            }
        }
	    System.out.println("정답입니다!!!");
	    System.out.println("당신은" + count + "번만에 정답을 맞췄습니다!!!");
	    arr[game_count++] = count;
	    count = 0;			// count값 초기화
	    int total_length = 0;
	    sum = 0;			// sum값 초기화
	    for(int i=0; i<arr.length ; i++) {
	    	if (arr[i] > 0) {
	    		sum = sum + arr[i];
	    		total_length++;
	    	}
	    }
	    System.out.println("지금까지 당신의 평균은" + (sum/(total_length)) +"번 입니다.");
	    System.out.println("한 게임 더 할까요? (Y/N)");
	    check = c.next().charAt(0);			// char check의 값을 입력받는 부분
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