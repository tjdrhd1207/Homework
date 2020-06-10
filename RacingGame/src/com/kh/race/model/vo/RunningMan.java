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
		
		String item[]= {"2�� �ν���","�ٳ��� �Ѹ���","�� "};
		int raceLength=500;
		sec=0;
		while(raceLength>0){
			
			raceLength-=super.getSpeed()-(super.getWeight()/10);
			
			System.out.println("----���� �ð��� "+sec+"�� �Դϴ�----");
			if(raceLength<0){
				System.out.println("��� ��� �����Դϴ�!");
				break;
			}
			
			System.out.println("��������� "+raceLength+"��ŭ ���ҽ��ϴ�!");
			
			
			if(raceLength<=250&&raceLength>=200){
				System.out.println("�������� ȹ���Ͽ����ϴ�.");
				super.setItem(true);
			}
			
			int chance = (int)(Math.random()*3);
			if(super.isItem()==true){
				
				
				switch(chance){
				case 0 : 
					System.out.println("~~~~2�� �ν��� �����Դϴ�.~~~~");
					super.setSpeed(2*super.getSpeed());
					break;
				case 1 :
					System.out.println("~~~�ٳ����� �Ѹ��ϴ�.~~~~");
					break;
				case 2 : 
					System.out.println("~~~~���Դϴ� �ڵ��� ���ϴ�.~~~~");
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
		
		System.out.println("������� "+sec+"�� ���� �����Ͽ����ϴ�");
		
	}
	
	
	@Override
	public void Start() {
		System.out.println("�ٱ� �����մϴ�!");
		System.out.println(super.getSpeed()-(super.getWeight()/10)+"�� �ӷ����� �ݴϴ�!");
	}
	
	
	
	
	@Override
	public void Stop() {
	System.out.println("�����մϴ�!");
	}


	@Override
	public void CharacteChoice() {
	System.out.println("ĳ���͸� �����մϴ�.");
	System.out.println("==========ĳ���� ���=========");
	System.out.println("1.���̾�     2.����ġ    3.����    4.������ ");
	System.out.println("ĳ���͸� ���ڷ� �����ϼ��� : ");
	Scanner sc =new Scanner(System.in);
	int no=sc.nextInt();
	switch(no){
		
	case 1 : System.out.println("���̾��� �����ϼ̽��ϴ�.");
			 super.setWeight(70);
			 System.out.println("������ : "+super.getWeight());
			 break;
	case 2 : System.out.println("����ġ�� �����ϼ̽��ϴ�.");
			 super.setWeight(60);
			 System.out.println("������ : "+super.getWeight());
			 break;
	case 3 : System.out.println("������ �����ϼ̽��ϴ�.");
			 super.setWeight(50);
			 System.out.println("������ : "+super.getWeight());
			 break;
	case 4 : System.out.println("�������� �����ϼ̽��ϴ�.");
			 super.setWeight(65);	
			 break;
		}
	
	
	
	}

	
	
}
