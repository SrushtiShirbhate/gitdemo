package Demo_Maven;

public class super_keyword_child extends super_keyword_parent{
	String name = "Academy";
	public void getData() {
		System.out.println(name);
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		super_keyword_child sc = new super_keyword_child();
		sc.getData();
		sc.getParentData();
	}
}
