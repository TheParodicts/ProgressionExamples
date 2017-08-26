
public class Testing {
	public static void main(String[] args) {
		
	Progression sum = new Progression();
	ArithmeticProgression sigma = new ArithmeticProgression(3,9);
	GeometricProgression mult = new GeometricProgression(5,3);
	FibonnacciProgression fibo = new FibonnacciProgression(5,2);
	
	sum.printProgression(5);
	sigma.printProgression(6);
	mult.printProgression(8);
	fibo.printProgression(6);
		
	}
}
