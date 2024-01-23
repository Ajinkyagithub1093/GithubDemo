
public class MehtodsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Why methods - set of lines code is reusuable then wrap of code
		
		MehtodsDemo1 d = new MehtodsDemo1();
		String name = d.getData();
		System.out.println(name);
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getUserData();
		getData2();
		
	}
	
	public String getData()
	{
		System.out.println("Hello World");
		return "Ajinkya bhagat";
	}
	
	public static String getData2()
	{
		System.out.println("Hello World");
		return "Ajinkya bhagat";
	}

}
