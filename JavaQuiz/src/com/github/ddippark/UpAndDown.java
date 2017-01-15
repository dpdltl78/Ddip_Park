package com.github.ddippark;

import java.util.Scanner;
import java.util.*;



public class UpAndDown {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in); // 문제맞추기를 시도하는 숫자
        Scanner m = new Scanner(System.in); // 정해진 숫자
        Scanner c = new Scanner(System.in); // 다시
        
        System.out.println("                 | | | | | | | | | | |");
        System.out.println("              | |                       | | ");
        System.out.println("            |                               |");
        System.out.println("          |                                   | ");                             
        System.out.println("        |              UP & DOWN                |");
        System.out.println("        | |                                   | |   ");
        System.out.println("        |   |                               |   |");
        System.out.println("        |     | |                       | |     |");
        System.out.println("        |         | | | | | | | | | | |         |   ");                             
        System.out.println("        |                                       |");
        System.out.println("        |                                       |");
        System.out.println("         |              좋은데이                     | ");
        System.out.println("          |                                   |   ");
        System.out.println("            |                               |");
        System.out.println("              | |                       | |");
        System.out.println("                  | | | | | | | | | | | ");
  
    while(true)
    {
        System.out.println("화면에 문제를 낼 숫자를 입력하세요.");
        int input = 0;
        char check;
        int result =m.nextInt();//입력받기 
        //System.out.println("당신이 입력한 숫자는 "+input);
        System.out.println("화면에 문제를 맞출 숫자를 입력하세요.");
        while(input!=result )
        {
    
             input = s.nextInt(); //입력받기
             while(true)
 {
        	if(input<result)//작으면
        	{
        	      System.out.println("UP!!!!");
        	      System.out.println("화면에 숫자를 한 번 더 입력하세요.");
        	      break;
        	      
        	}
        	else if(input>result)
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
	      System.out.println("한 게임 더 할까요?(Y/N)");
//int result =m.nextInt()
	      check = c.next().charAt(0);
	      if(check=='Y'){
	        continue;
	      }
	      else if(check =='N')
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


/*
public class UpAndDown {
	public static void main(String args[]) {
		int result = 100; //맞춰야할 숫자

		System.out.println("이 게임은 업 앤다운 게임입니다.");
		System.out.println("숫자를 입력해 주세요.");
		//InputStream is = 
		Scanner scan= new Scanner(System.in); //값 입력받음	
		while(Integer.parseInt(scan)!=result)
		{
			System.out.println("숫자를 입력해 주세요.");
			//InputStream is = 
			Scanner scan= new Scanner(System.in); //값 입력받음
		}
	}

}
*/
