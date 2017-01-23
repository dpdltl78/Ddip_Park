package com.test.updowngame;

import java.io.Serializable;

public class SetElements implements Serializable{ 
	protected int play_count;
	protected int game_count;

	protected int user_input;
	transient protected int random_num;
	protected char answer;
	static int[] arr = new int[100];
	
	protected double avg;
	protected double sum;
	protected double total_length;

}
