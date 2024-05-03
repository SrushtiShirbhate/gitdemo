package Demo_Maven;

public class Constructor {
	// Default constructor
	public Constructor() {
		System.out.println(" I am in the constructor"); 
		System.out.println(" I am in the constructor lecture 1"); 
	}
	// Parameterized constructor
    public Constructor(int a, int b) 
	{ 
		System.out.println(" I am in the parameterized constructor"); 
		int c=a+b; 
		System.out.println(c);
	} 
	public Constructor(String str) 
	{ 
		System.out.println(str); 
	} 
	
	public void getdata() 
	{ 
		System.out.println("I am the method"); 
	} 
	//will not return values //name of constructor should be the class name

	public static void main(String[] args) { 
		// TODO Auto-generated method stub 
		@SuppressWarnings("unused")
		Constructor cd= new Constructor();
		@SuppressWarnings("unused")
		Constructor cds= new Constructor("hello"); 
		@SuppressWarnings("unused")
		Constructor c= new Constructor(4,5); 
		// compiler will call implicit constructor if you have not defined constructor block 
		//when ever you create an object constructor is called 
		//block of code when ever an object is created 
		}
}
