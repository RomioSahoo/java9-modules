package assignment.moduleTwo.basic;

import assignment.moduleFour.basic.moduleFourClass;
import assignment.moduleThree.basic.modulThreeClass;

public class moduleTwoClass {
	modulThreeClass moc3=new modulThreeClass();
	moduleFourClass moc4=new moduleFourClass();
	
	public void grade() {
		System.out.println(moc3.grade());
		System.out.println(moc4.grade());
	}
	
	
}
