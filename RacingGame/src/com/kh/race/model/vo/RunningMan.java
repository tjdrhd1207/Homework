package com.kh.race.model.vo;

import java.util.Scanner;


public class RunningMan extends Person implements FinishAndStart{

	
	public RunningMan(){}
		private int sec;
	
	public RunningMan(int speed, int weight, boolean item){
		super(speed, weight, item);
		this.sec=sec;
	}
	
	
	
	
	
	public void race(){
		
		String item[]= {"2배 부스터","바나나 뿌리기","꽝 "};
		int raceLength=500;
		sec=0;
		while(raceLength>0){
			
			raceLength-=super.getSpeed()-(super.getWeight()/10);
			
			System.out.println("----현재 시간은 "+sec+"초 입니다----");
			if(raceLength<0){
				System.out.println("결승 통과 직전입니다!");
				break;
			}
			
			System.out.println("결승점까지 "+raceLength+"만큼 남았습니다!");
			
			
			if(raceLength<=250&&raceLength>=200){
				System.out.println("아이템을 획득하였습니다.");
				super.setItem(true);
			}
			
			int chance = (int)(Math.random()*3);
			if(super.isItem()==true){
				
				
				switch(chance){
				case 0 : 
					System.out.println("~~~~2배 부스터 찬스입니다.~~~~");
					super.setSpeed(2*super.getSpeed());
					break;
				case 1 :
					System.out.println("~~~바나나를 뿌립니다.~~~~");
					break;
				case 2 : 
					System.out.println("~~~~꽝입니다 뒤돌아 갑니다.~~~~");
					raceLength+=200;
					break;
				default :
					break;
				}
			}
			sec++;
			super.setItem(false);
		}
		
		
	}
	
	
	@Override
	public void Finish() {
		
		System.out.println("결승점에 "+sec+"초 만에 도착하였습니다");
		
	}
	
	
	@Override
	public void Start() {
		System.out.println("뛰기 시작합니다!");
		System.out.println(super.getSpeed()-(super.getWeight()/10)+"의 속력으로 뜁니다!");
	}
	
	
	
	
	@Override
	public void Stop() {
	System.out.println("정지합니다!");
	}


	@Override
	public void CharacteChoice() {
	System.out.println("캐릭터를 선택합니다.");
	System.out.println("==========캐릭터 목록=========");
	System.out.println("1.라이언     2.어피치    3.무지    4.제이지 ");
	System.out.println("캐릭터를 숫자로 선택하세요 : ");
	Scanner sc =new Scanner(System.in);
	int no=sc.nextInt();
	switch(no){
		
	case 1 : System.out.println("라이언을 선택하셨습니다.");
			 super.setWeight(70);
			 System.out.println("몸무게 : "+super.getWeight());
			 break;
	case 2 : System.out.println("어피치를 선택하셨습니다.");
			 super.setWeight(60);
			 System.out.println("몸무게 : "+super.getWeight());
			 break;
	case 3 : System.out.println("무지를 선택하셨습니다.");
			 super.setWeight(50);
			 System.out.println("몸무게 : "+super.getWeight());
			 break;
	case 4 : System.out.println("제이지를 선택하셨습니다.");
			 super.setWeight(65);	
			 break;
		}
	
	
	
	}

	
	
}
