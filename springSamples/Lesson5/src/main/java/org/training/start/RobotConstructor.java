package org.training.start;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.training.impls.robot.ModelT1000;
import org.training.impls.sony.SonyHand;
import org.training.impls.sony.SonyHead;
import org.training.impls.toshiba.ToshibaLeg;

public class RobotConstructor {
	
	public static void main(String[] args){

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Object object = context.getBean("t1000");
		if(object instanceof ModelT1000){
			ModelT1000 t1000 = (ModelT1000) object;
			t1000.dance();
		}
	}

}
