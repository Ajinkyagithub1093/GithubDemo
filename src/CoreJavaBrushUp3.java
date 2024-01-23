 
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String is a object that represent sequence of characters
		
		//literal
		//String s = "Ajinkya Kishor Bhagat";
		//String s1 = "Ajinkya Kishor Bhagat";
		//new memory locator
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		String s = "Ajinkya Kishor Bhagat";
		String[] spltiwise = s.split(" ");
		System.out.println(spltiwise[0]);
		System.out.println(spltiwise[1]);
		System.out.println(spltiwise[2]);
		System.out.println("===========================");
		String[] spltiwise1 = s.split("Kishor");
		System.out.println(spltiwise1[0]);
		System.out.println(spltiwise1[1]);
		System.out.println(spltiwise1[1].trim());
		System.out.println("==========================="); //print each character 
		for (int i=0; i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		System.out.println("==========================="); //print each character in reverse order
		for (int i=s.length()-1; i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
	}

}
