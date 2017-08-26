
public class Progression {
int current;

public Progression(){this(0);}
public Progression(int start){
	this.current = start;
}

public int nextValue(){
	int currentNum=current;
	advance();
	return currentNum;
}

protected void advance(){
	current++;
}

public void printProgression(int n){
	do{
		System.out.print(" "+current);
		this.advance();
		n--;
	}while (n>=0);
	System.out.println();
}
}
