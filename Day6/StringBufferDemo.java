package Strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//are mutable
		StringBuffer sb1 =  new StringBuffer("Porkodi");
		System.out.println(sb1);
		
		//reversing a string buffer
		sb1.reverse();
		System.out.println(sb1);
		
		//converting sb to string
		System.out.println(sb1.toString());
		
			
		//converting string to sb
		String s = "DataStructures";
		StringBuffer sb2 = new StringBuffer(s);
	
		 System.out.println("Before deleting sb2 ->"  + sb2);
		   for(int i = 0; i <sb2.length(); i++) {
			   System.out.println(i + " -> " + sb2.charAt(i));
		   }
		   
		//deleting the char at particular index
		sb2.deleteCharAt(0);
		System.out.println("After deleting sb2 ->"  + sb2);
		   for(int i = 0; i <sb2.length(); i++) {
			   System.out.println(i + " -> " + sb2.charAt(i));
		   }
		
		//System.out.println(sb2);
		
		   System.out.println("Before inserting sb2 ->"  + sb2);
		   for(int i = 0; i <sb2.length(); i++) {
			   System.out.println(i + " -> " + sb2.charAt(i));
		   }
   sb2.insert(3, '-');
   System.out.println("After inserting sb2 ->"  + sb2);
   for(int i = 0; i <sb2.length(); i++) {
	   System.out.println(i + " -> " + sb2.charAt(i));
   }
   
   System.out.println("Before deleting sb1 ->"  + sb1);
   for(int i = 0; i <sb1.length(); i++) {
	   System.out.println(i + " -> " + sb1.charAt(i));
   }
   
   
   sb1.delete(2, 5);
   System.out.println("After deleting sb1 ->"  + sb1);
   for(int i = 0; i <sb1.length(); i++) {
	   System.out.println(i + " -> " + sb1.charAt(i));
   }
   
  sb1.setCharAt(0, 'A');
  System.out.println(sb1);
	}

}
