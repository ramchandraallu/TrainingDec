package basicPrograme;

public class Testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstPrgm x123=new FirstPrgm();  //object creation
		x123.driving();
		System.out.println(x123.abc);
		Testclass ref123= new Testclass();
		ref123.test();
			
	}
	
	
	public void test() {
		System.out.println("this is anotheer class");
	}

}
