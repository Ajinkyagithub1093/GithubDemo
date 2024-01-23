
public class CoreJavaBrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
        String website ="rahul shetty academy";
        char letter = 'r';
        double dec = 1.02;
        boolean mycard = true;
        
        System.out.println(num+" is the value stored in num varaible");
        System.out.println(website);
        System.out.println("===========================");
        
//===========================Arrays - store multiple values=================================     
        
        int[] arr = new int[5]; //new will create memory to store
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        
        int[] arr2 = {6,7,8,9,10,32432,4234325,5346356,547568568};
        System.out.println(arr2[2]); // retreive values based on index
        System.out.println("===========================");    
//============================for loop============================================= 
        
        for (int i =0;i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        }
        System.out.println("========="); 
        for (int i =0;i<arr2.length;i++)
        {
        	System.out.println(arr2[i]);
        }
        System.out.println("========="); 
        String[] Name = {"a","j","i","n","k","y","a"};
        for (int i =0;i<Name.length;i++)
        {
        	System.out.println(Name[i]);
        }
        System.out.println("========="); 
        for(String s:Name)
        {
        	System.out.println(s);
        }
        	
      
	}

}
