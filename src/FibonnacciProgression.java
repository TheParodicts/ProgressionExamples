
public class FibonnacciProgression extends Progression {
int previous;

public FibonnacciProgression(){this(0,1);}
public FibonnacciProgression(int first, int second){
	super(second);
	previous=first;
}

public void advance(){
	int newPrevious=current;
	current+=previous;
	previous=newPrevious;
}

public void printProgression(int n){
	System.out.print(" "+previous);
	do{
		System.out.print(" "+current);
		this.advance();
		n--;
	}while (n>=0);
	System.out.println();
}
}
