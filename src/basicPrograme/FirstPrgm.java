package basicPrograme;

public class FirstPrgm {

	 String carname="Duster";
	 String color= "White";
	 static String model="RXL";
	 int abc=3;
	

	public static void main(String[] args) {
		
		System.out.println("testy ");
		FirstPrgm test= new FirstPrgm(); 
		test.driving();//callng
		test.sum(3,5);
		test.sum(4,5);
		test.sum(5,5);
		test.sum(7,5);
		test.sum(8,5);
		
		
		
		
		
		
	}
	

	public  void driving() {
		
		System.out.println("Driving a car");
		model="RXz";
		System.out.println("updated model is "+model);
		
	}
	
	public void gearchange() {
		System.out.println("gear change ");
	}
	
	public void sum(int a , int b) {
		
		System.out.println("SUM OF TWO NUMBERS  "+(a+b));
		//BODMAS
	}
		
			
	

}
