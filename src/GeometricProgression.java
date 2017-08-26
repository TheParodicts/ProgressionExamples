
public class GeometricProgression extends Progression {
int base;

public GeometricProgression(){this(1,2);}

public GeometricProgression(int start, int baseNum){
	super(start);
	base=baseNum;
}

public void advance(){
	current=current*base;
}
}
