
public class ArithmeticProgression extends Progression {
int increment;

public ArithmeticProgression(){this(0,1);}
public ArithmeticProgression(int start, int advance){
	super(start);
	increment=advance;
}

public void advance(){
	current+=increment;
}
}
