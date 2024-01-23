package oopsconcept;

public class PS4 {
	
	public PS4(int a) {//int a is instance variable
		this.a = a;
	}
	
	int a; //class level variable
	public int multiplybytwo() {
		a=a*2;
		return a;
	}
	public int multiplybythree() {
		a=a*3;
		return a;
	}

}
