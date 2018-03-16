package org.training.impl.toshiba;

import org.springframework.stereotype.Component;
import org.training.interfaces.Head;

@Component
public class ToshibaHead implements Head {
	
	public void calc(){
		System.out.println("Thinking about Toshiba...");
	}

}
