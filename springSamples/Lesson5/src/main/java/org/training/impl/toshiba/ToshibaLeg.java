package org.training.impl.toshiba;

import org.springframework.stereotype.Component;
import org.training.interfaces.Leg;

@Component
public class ToshibaLeg implements Leg {
	
	public void go(){
		System.out.println("Go to Toshiba!");
	}

}
