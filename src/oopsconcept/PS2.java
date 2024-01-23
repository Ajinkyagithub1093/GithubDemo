package oopsconcept;

import org.testng.annotations.Test;

//PS1 is parent class and PS2 is child class
public class PS2 extends PS1 {

@Test
public void testRun() {
	doTHis();
	//int a = 2;
	PS3 ps2 = new PS3(2); // parameterized constructor
	System.out.println(ps2.increament());
	System.out.println(ps2.decreament());
	System.out.println(ps2.multiplybythree());
}

}
