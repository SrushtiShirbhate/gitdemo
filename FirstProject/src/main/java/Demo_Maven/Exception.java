package Demo_Maven;

public class Exception {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=7; 
		int c=0;
		try {
			int k=b/c;
			int arr[]=new int[5];
			System.out.println(arr[7]);
		}
		catch(ArithmeticException et) {
			System.out.println("I catched the Arthimetic/exception");
		}
		catch(IndexOutOfBoundsException ets) {
			System.out.println("I catched the IndexBound/exception");
		}
		finally {
			System.out.println("delete cookies");
		}

	}

}
