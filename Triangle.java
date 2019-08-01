package SpringPracticeBasic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Triangle implements ShapeDistinguisher {

	private int sides;
	
	public Triangle() {
		setSides(3);
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
