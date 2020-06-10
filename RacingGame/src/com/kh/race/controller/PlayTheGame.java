package com.kh.race.controller;

import com.kh.race.model.vo.Person;
import com.kh.race.model.vo.RunningMan;

public class PlayTheGame {
	public void startGame(){
		
		Person player = new RunningMan(50,60,false);
		((RunningMan)player).CharacteChoice();
		((RunningMan)player).Start();
		((RunningMan)player).race();
		((RunningMan)player).Finish();
	}
}
