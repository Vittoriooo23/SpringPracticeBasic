package SpringPracticeBasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import SpringPracticeBasic.Shape;

@SpringBootApplication
public class SpringPracticeBasicApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(SpringPracticeBasicApplication.class, args);
		
		Shape shape = applicationContext.getBean(Shape.class);
		
		shape.print();
	}

}
