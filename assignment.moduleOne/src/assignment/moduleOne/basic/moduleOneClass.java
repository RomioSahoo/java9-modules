package assignment.moduleOne.basic;

/*Create 4 modules. Module1 will consume package/class from module2. 
Module 2 will consume package/class from module 3 and module4.
public static void main will be in module1*/

import assignment.moduleTwo.basic.moduleTwoClass;

public class moduleOneClass {
	public static void main(String args[]) {
		moduleTwoClass moc2 = new moduleTwoClass();
		moc2.grade();
	}
}
