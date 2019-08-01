package SpringPracticeBasic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Square implements ShapeDistinguisher{

	private int sides;
	
	public Square() {
		setSides(4);
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}
	
	@Override
	public int getsides() {
		return sides;
	}
	
}
