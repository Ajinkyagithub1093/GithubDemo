import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class Streams1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> A = new ArrayList<String>(); // package contains class
		A.add("ajju");
		A.add("jack");
		A.add("ishan");
		A.add("nitin");
		A.add("khushbu");
		A.add("yakub");
		A.add("abhijeet");
		int count = 0;
		for (int i = 0; i < A.size(); i++) {
			String names = A.get(i);
			if (names.startsWith("a")) {
				count++;
			}
		}
		System.out.println(count);
		//Streams2();
		//streamMap();
		streamCollect();
	}
	
public static void Streams2() {
		// TODO Auto-generated method stub
		ArrayList<String> A = new ArrayList<String>(); // package contains class
		A.add("ajju");
		A.add("jack");
		A.add("ishan");
		A.add("nitin");
		A.add("khushbu");
		A.add("yakub");
		A.add("abhijeet");
		
		/*Long c = A.stream().filter(s->s.startsWith("a")).count();
		System.out.println(c);
		return c;*/
		Long d = Stream.of("ajju","jack","ishan","nitin","khushbu","yakub","abhijeet").filter(s->
		{
			s.startsWith("a");
			return true;
		}).count();
		System.out.println(d);
		//print all names of array list having letters greater than 4
		//A.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	    A.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
}
public static void streamMap() {
	
	//print names end woith a and changes to upper case
	Stream.of("ajju","jack","ishan","aman","khushbua","yakuba","abhijeet").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s)) ;
	
	List<String> names1=Arrays.asList("ajju","jack","ishan","aman","khushbua","yakuba","abhijeet","ISIS");
	List<String> names2=Arrays.asList("ajju","jack","ishan","aman","khushbua","yakuba","abhijeet");
	names1.stream().filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s)) ;
	//merging two different Arraylist
	Stream<String> newstream = Stream.concat(names2.stream(), names1.stream());
	newstream.sorted().forEach(s->System.out.println(s));
	boolean Flag = newstream.anyMatch(s->s.equalsIgnoreCase("ISIS"));
	System.out.println(Flag);
	Assert.assertTrue(Flag);	
} 
public static void streamCollect() {
	List<String> ls = Stream.of("ajju","jacka","ishan","aman","khushbua","yakuba","abhijeet").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
	.collect(Collectors.toList());
	System.out.println(ls.get(0)) ;
	
	
	List<Integer> values = Arrays.asList(5,7,3,1,8,9,4,7,2,7);
	//values.stream().distinct().forEach(s->System.out.println(s));//print unique number 
	List<Integer> i = values.stream().distinct().sorted().collect(Collectors.toList());// sort the array
	System.out.println(i) ;
	System.out.println(i.get(3)) ;
}
}
