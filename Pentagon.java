package SpringPracticeBasic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import SpringPracticeBasic.ShapeDistinguisher;

@Component
@Primary
public class Pentagon implements ShapeDistinguisher{
	
	private int sides;
	
	public Pentagon() {
		setSides(5);
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
