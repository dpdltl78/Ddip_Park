package com.test.lotto;

import java.util.Scanner;

public class UpAndDownVer3 {
	int count;
    int input;
    int random_num;
    
  
 
	public UpAndDownVer3(){
		count=0;
	    input = 0;
	    random_num= (int)(Math.random()*100+1);
	    
	
	   
		}
	    

	
	
boolean loop(){	
		
	       //  input = trynum.nextInt(); //입력받기
		while(input!=random_num){
			//input = trynum.nextInt();
	         	count++;
	         	if(input<random_num)    
	         	{
	         		System.out.println("UP!!!!");
	         		System.out.println("화면에 숫자를 한 번 더 입력하세요.");
	         		return false;
		        	}
		        	else if(input>random_num)
		        	{
		        	System.out.println("DOWN!!!!"); 
	     		  	System.out.println("화면에 숫자를 한 번 더 입력하세요.");
	     		  	return false;
		        	}
		        	else 
		        	{
		        	return true;
		        	}
	         
	     
		}
		return true;
	}


}

    




