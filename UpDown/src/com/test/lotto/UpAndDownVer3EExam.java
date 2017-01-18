package com.test.lotto;

public class UpAndDownVer3EExam {
	public static void main(String[] args) {
		UpAndDownVer3Exam main_game = new UpAndDownVer3Exam();
	
		do{
			System.out.print(main_game.start());
		//	main_game.input();
			while(main_game.game.loop()!=2 )
			{
			System.out.println(main_game.loopinput());
			}
			if(main_game.loop_check==false)
			System.out.println(main_game.calculate());
			main_game.reset_count();
		}while(main_game.askagain()==true);
		
		System.out.println(main_game.print);
	}
}
