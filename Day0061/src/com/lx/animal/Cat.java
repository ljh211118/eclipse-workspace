package com.lx.animal;

public abstract class Cat implements IAnimal {
	// abstract : implements가 미완성임을 알고 있음 -> 오류가 안뜨게 막음
	
	public void run() {
		System.out.println("고양이가 뛰어갑니다.");
	}

//	public void walk(int speed) {
//	}
	
}
