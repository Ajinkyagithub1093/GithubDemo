package oopsconcept;

public class PS3 extends PS4 {

	public PS3(int a) {//int a is instance variable
		super(a); //parent class constructor is invoked
		this.a = a;
	}

	int a; //class level variable
	public int increament() {
		a=a+1;
		return a;
	}
	public int decreament() {
		a=a-1;
		return a;
	}

}
