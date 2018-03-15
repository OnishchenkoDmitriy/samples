package org.training.start;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.training.impl.robot.ModelT1000;

public class RobotConstructor {
	
	public static void main(String[] args){

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Object object = context.getBean("t1000Empty");
		if(object instanceof ModelT1000){
			ModelT1000 t1000 = (ModelT1000) object;
			t1000.action();
		}
	}

}
