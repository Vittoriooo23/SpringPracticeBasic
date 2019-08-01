package SpringPracticeBasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import SpringPracticeBasic.ShapeDistinguisher;

@Component
public class Shape {

	@Autowired
	private ShapeDistinguisher shapeDistinguisher;
	
	
	public void print() {
		System.out.println(shapeDistinguisher.getsides());
	}
	
	
}
