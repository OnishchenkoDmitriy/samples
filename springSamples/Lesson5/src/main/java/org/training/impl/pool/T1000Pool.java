package org.training.impl.pool;

import org.training.interfaces.Robot;
import org.training.interfaces.RobotPool;

import java.util.Collection;
import java.util.Map;

public class T1000Pool implements RobotPool {

    private Map<String, Robot> robotCollection;

    public T1000Pool(Map<String, Robot> robotCollection) {

        this.robotCollection = robotCollection;
    }

    public T1000Pool() {
    }

    public void setRobotCollection(Map<String, Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    public Map<String, Robot> getRobotCollection() {
        return robotCollection;
    }

    public void beginShow(){
        robotCollection.forEach((key, value) -> {
            System.out.println(key);
            value.action();
            System.out.println("/////////////////////");
        });
    }
}
