package com.kh.race.model.vo;



public abstract class Person implements FinishAndStart {
	private int speed;
	private int weight;
	private boolean item;
	
	
	public Person(){
		
	}


	public Person(int speed, int weight, boolean item) {
		//super();
		this.speed = speed;
		this.weight = weight;
		this.item = item;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public boolean isItem() {
		return item;
	}


	public void setItem(boolean item) {
		this.item = item;
	}

	@Override
	public void Start() {
		System.out.println("뛰기 시작합니다!");
		
	}
	@Override
	public void Finish() {
		System.out.println("결승점에 도착하였습니다!");
		
	}
	
	public abstract void Stop();
	
}