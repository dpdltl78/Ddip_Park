package com.test.lotto;

import java.util.Scanner;

public class UpAndDownVer3EExam {

	public static void main(String[] args) {
		boolean loopAgain;
		Scanner trynum = new Scanner(System.in);
		Scanner checkchar = new Scanner(System.in);
		UpAndDownVer3Exam MainGame = new UpAndDownVer3Exam();

		do {
			MainGame.start();

			System.out.println("Up & Down 게임입니다.\n1부터 100까지의 숫자 중 맞춰주세요.");

			MainGame.setInput(trynum.nextInt());// 사용자 입력
			MainGame.game.plusCount();

			while (MainGame.game.getRanNum() != MainGame.game.getInput()) {
				if (MainGame.game.loop() == 0) {
					System.out.println("UP!!!!!");
					MainGame.setInput(trynum.nextInt());
				} else if (MainGame.game.loop() == 1) {
					System.out.println("Down!!!!!");
					MainGame.setInput(trynum.nextInt());
				} else {
					continue;
				}
				MainGame.game.plusCount();
			}
			System.out.println("정답입니다\n 당신은" + MainGame.game.getCount() + "번 만에 정답을 맞췄습니다!!.");
			// 게임횟수 배열에 입력
			MainGame.countInputArr(MainGame.game.getCount());

			// 입력 끝
			MainGame.calculate();

			System.out.println("지금까지 당신의 평균은 " + MainGame.getAver() + "번 입니다.");
			System.out.println("한번 더 하시겠습니까? (Y/N)");

			MainGame.game.putC(checkchar.next().charAt(0));
			if (MainGame.askagain(MainGame.game.getC()) == 0) {
				loopAgain = true;
			} else if (MainGame.askagain(MainGame.game.getC()) == 1) {
				loopAgain = false;
				System.out.println("안녕히 가세요~");
			} else {
				loopAgain = false;
				System.out.println("손가락이 미끄러졌나요? 조심히 가세요~");
			}
		} while (loopAgain);
	}
}
