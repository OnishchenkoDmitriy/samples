package org.training.start;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.training.impl.robot.ModelT1000;

public class RobotConstructor {
	
	public static void main(String[] args){

		ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");

		ModelT1000 model_1 = (ModelT1000) context.getBean("model_1");
		ModelT1000 model_2 = (ModelT1000) context.getBean("model_2");
		model_1.action();
		model_2.action(); 

	}

}
