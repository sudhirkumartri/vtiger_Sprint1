package newPrograms;

public class MultipleStaticBlock {

	
	//instance block
	{
		System.out.println("instace block 1");
		
	}
	{
		System.out.println("instace block 2");
	}
	//constructor
	MultipleStaticBlock(){
		System.out.println("this is contructor block");
	}
	//static block
	static
	{
		System.out.println("staic block 1");
	}
	static {
		System.out.println("static block2");
		
	}
	public static void main(String[] args) {
		MultipleStaticBlock mb = new MultipleStaticBlock();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
