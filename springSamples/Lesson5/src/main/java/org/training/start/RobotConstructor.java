package org.training.start;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.training.impl.robot.ModelT1000;
import org.training.interfaces.Robot;
import org.training.interfaces.RobotConveyor;

public class RobotConstructor {
	
	public static void main(String[] args){

		ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");

		RobotConveyor t1000Conveyor = (RobotConveyor) context.getBean("t1000Conveyor");

		Robot terminator1 = t1000Conveyor.createRobot();
		Robot terminator2 = t1000Conveyor.createRobot();
		Robot terminator3 = t1000Conveyor.createRobot();

		System.out.println("Terminator 1 " + terminator1);
		System.out.println("Terminator 2 " + terminator2);
		System.out.println("Terminator 3 " + terminator3);
	}

}
