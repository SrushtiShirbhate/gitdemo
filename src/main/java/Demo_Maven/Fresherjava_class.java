package Demo_Maven;

public class Fresherjava_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] age = {12, 13, 14, 15};
		
		System.out.println("Accessing Elements of Array");
		for(int i = 0; i < age.length; i++){
			System.out.println(age[i]);
	}
		String s = "Srushti" + "Shirbhate";
		System.out.println(s);
		
		String s1 = "java split method";
		String[] name=s1.split("\\s");
		for(String n:name) {
		System.out.println(n);
		}
	}
	    
}
