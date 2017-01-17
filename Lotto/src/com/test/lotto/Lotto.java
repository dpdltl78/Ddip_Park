package com.test.lotto;

import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        Scanner insert_number = new Scanner(System.in); // 문제맞추기를 시도하는 숫자
        int[] my_game = new int[3];
        my_game[0]=1;
        
    while(true)
    {
       System.out.println("     ┌──────────────┐");
       System.out.println("     │UP & DOWN GAME│");
       System.out.println("     └──────────────┘");
        System.out.println("───────★NEW GAME★───────");
        System.out.print("        ");
        System.out.println(my_game[0] + "번째 게임");
        System.out.println("──────────────────────────");
        System.out.print("남은 목숨 : ");
        my_game[2]=5;
       for(int i=0; i<my_game[2];i++)
       {
          System.out.print("*");
       }
       System.out.println();
       System.out.println("──────────────────────────");
        my_game[1]=1;
        int my_number = 0;
        char check;
        int ans_number =(int) (Math.random()*50)+1;
        //System.out.println("당신이 입력한 숫자는 "+input);
        System.out.println("화면에 문제를 맞출 숫자를 입력하세요.");
      System.out.println(my_game[1]+"번째 시도중입니다");
      System.out.println("──────────────────────────");
        while(my_number!=ans_number && my_game[2]>0 )
        {
             my_number = insert_number.nextInt(); //입력받기
             while(my_game[1]>0)
             {
                if(my_number>50)
                {
                   System.out.println("0~50사이의 숫자를 입력하세요;;");
                   break;
                }
                else if(my_number<ans_number)//작으면
                {
                   System.out.println("UP!!!!");
                   System.out.println("화면에 숫자를 한 번 더 입력하세요.");
                   my_game[1] = my_game[1]+1;
                   my_game[2] = my_game[2]-1;
                   System.out.println(my_game[1]+"번째 시도중입니다");
                   System.out.print("남은 목숨 : ");
                   
                   for(int i=0; i<my_game[2];i++)
                   {
                      System.out.print("*");
                   }
                   
                   System.out.println();
                   System.out.println("──────────────────────────");

                   break;    
                }
                else if(my_number>ans_number)
                {
                   System.out.println("DOWN!!!!"); 
                   System.out.println("화면에 숫자를 한 번 더 입력하세요.");
                   my_game[1] = my_game[1]+1;
                   my_game[2] = my_game[2]-1;
                   System.out.print("남은 목숨 : ");
                   
                   for(int i=0; i<my_game[2];i++)
                   {
                      System.out.print("*");
                   }
                   
                   System.out.println();
                   System.out.println("──────────────────────────");
                   break;
                }
                else if(my_number == ans_number)
                {
                   break;
                }                
             }
            
        }

        if(my_number==ans_number){
         System.out.println("정답입니다!!!");
         System.out.println(my_game[1]+"번만에 맞췄습니다");
         System.out.println("한 게임 더 할까요?(Y/N)");

         check = insert_number.next().charAt(0);
         if(check=='Y' || check=='y'){
          my_game[0]=my_game[0]+1;
           continue;
         }
         else if(check =='N'||check=='n')
         {
            System.out.println("안녕히 가세요~");
            break;
         }
         else
         {
             System.out.println("손가락이 미끄러졌나요? 잘가요");
             break;
         }
        }
        if(my_game[2]==0 && my_number!=ans_number)
        {
           System.out.println("GAME OVER");
           System.out.println("한 게임 더 할까요?(Y/N)");
           check = insert_number.next().charAt(0);
           if(check=='Y' || check=='y'){
               my_game[0]=my_game[0]+1;
                continue;
              }
              else if(check =='N'||check=='n')
              {
                 System.out.println("안녕히 가세요~");
                 break;
              }
              else
              {
                  System.out.println("손가락이 미끄러졌나요? 잘가요");
                  break;
              }
        }
         
    }
}//최고 바깥 while
}//Lotto