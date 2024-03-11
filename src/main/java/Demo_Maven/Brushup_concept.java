package Demo_Maven;

public class Brushup_concept {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum = 5;
		String website = "Rahul Shetty Academy";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		System.out.println(myNum+"is the value stored in the myNum variable");
		System.out.println(website);
		
		// Array
		int[] arr = new int[5];// 5, 10
		arr[0] = 1;
		arr[1] = 2;
		arr[2]= 4;
		arr[3]= 5;
		arr[4]= 6;
		int[] arr2 = {1,2,4,5,6};
		System.out.println(arr2[0]);
		
		// Loop
		for(int i = 0; i< arr.length; i++) //4
		{
		System.out.println(arr[i]);
		}
		for (int i =0;i<arr2.length; i++)
		{
		System.out.println(arr2[i]);
		}
		String[] name = {"rahul", "shetty", "selenium"};
		for(int i =0; i<name.length;i++)
		{
		System.out.println(name[i]);
		}
		for( String s: name)
		{
		System.out.println(s);
		}
		
		//string is an object //String literal
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		String s = "Rahul Shetty Academy";
		String[] splittedString = s.split("Shetty");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		for(int i =s.length()-1;i>=0;i--)
		{
		System.out.println(s.charAt(i));
		}
	}
 
}