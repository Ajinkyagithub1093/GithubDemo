 import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Corejavabrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {2,3,4,5,6,7,8,9,10};
		//if else loop with for loop
		for (int i =0;i<arr2.length;i++) {
		if(arr2[i]%2==0)
		{
			System.out.println(arr2[i]);
		}
		else
		{
			System.out.println(arr2[i]+" is not divided by 2");
		}
	}
		//check array have a value which is multiple of 2
		System.out.println("===========================");  
	
		for (int i =0;i<arr2.length;i++) {
		if(arr2[i]%2==0)
		{
			System.out.println(arr2[i]);
			break;
		}
		else
		{
			System.out.println(arr2[i]+" is not divided by 2");
		}
	}
		System.out.println("==========================="); 
		//Array List
		ArrayList<String> A = new ArrayList<String>(); //package contains class 
		A.add("a");
		A.add("j");
		A.add("i");
		A.add("n");
		A.add("k");
		A.add("y");
		A.add("a");
		A.remove(4);
		System.out.println(A.get(4));
		
		for (int i =0;i<A.size();i++)
		{
			System.out.println(A.get(i));	
		}
		for(  String val :A)
		{
			System.out.println(val); 
		}
		
		//check arraylist contain k
		System.out.println(A.contains("n"));
		//convert array into arraylist
		String[] Name = {"a","j","i","n","k","y","a"};
		List<String> Namearraylist = Arrays.asList(Name);
		System.out.println(Namearraylist.contains("j")) ;
	
	}

}
