package com.moduleTwo.basic;

import com.moduleOne.basic.moduleOneClass;
import com.moduleThree.basic.moduleThreeClass;

public class moduleTwoClass {

	public static void main(String[] args) {
		
		moduleOneClass moc=new moduleOneClass();
		System.out.println(moc.name());
		
		moduleThreeClass moc1=new moduleThreeClass();
		System.out.println(moc1.age());

	}

}
