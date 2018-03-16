package org.training.impl.robot;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;


public class ActionReplacer implements MethodReplacer {
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {

        System.out.println("New action");
        return null;
    }
}
