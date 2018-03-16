package org.training.impl.toshiba;

import org.springframework.stereotype.Component;
import org.training.interfaces.Hand;

@Component
public class ToshibaHand implements Hand {
	
	public void catchSomething(){
		System.out.println("Catched from Toshiba!");
	}

}
