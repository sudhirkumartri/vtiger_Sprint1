
public class MultipleStaticBlock {

	public static void main(String[] args) {
		System.out.println(" main method");
		new MultipleStaticBlock();

	}
	
	
	//instance block
	{
		System.out.println("instance block1");
	}
	
	{
		System.out.println("instance block2");
		
	}
	
	static {
		System.out.println("static block");
	}
}
