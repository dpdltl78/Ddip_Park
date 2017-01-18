package com.test.lotto;



public class UpAndDownVer3 {
	int count;
    int input;
    int random_num;
    int[] aary= new int[100];
 
    String Up;
    String Down;
    String loop_result;
 
	public UpAndDownVer3(){
		count=0;
	    input = 0;
	    random_num= (int)(Math.random()*100+1);
	    aary[count]+=count;
	    Up="UP!!\n화면에 숫자를 한 번 더 입력하세요.";
	    Down="DOWN!!!!\n화면에 숫자를 한 번 더 입력하세요.";
		}
	    

	
	
int loop(){	
		
	       //  input = trynum.nextInt(); //입력받기
		while(input!=random_num){
			//input = trynum.nextInt();
	         	//count++;
	         	if(input<random_num)    
	         	{
	         		//System.out.println("UP!!!!");
	         		//System.out.println("화면에 숫자를 한 번 더 입력하세요.");
	         		loop_result =Up;
	         		return 0;
		        	}
		        	else if(input>random_num)
		        	{
		        	//System.out.println("DOWN!!!!"); 
	     		  	//System.out.println("화면에 숫자를 한 번 더 입력하세요.");
		        	loop_result=Down;
	     		  	return 1;
		        	}
		        	else 
		        	{
		        	return 2;
		        	}
	         
	     
		}
		return 2;
	}

void count()
{
	count++;
}
}

    




