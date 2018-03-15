package org.training.impl.robot;

import org.training.interfaces.Hand;
import org.training.interfaces.Head;
import org.training.interfaces.Leg;
import org.training.interfaces.Robot;

public class ModelT1000 extends BaseModel{

    private String color;
    private int year;
    private boolean soundEnabled;

    public ModelT1000() {
    }

    public ModelT1000(Hand hand, Leg leg, Head head) {
        super(hand, leg, head);
    }

    public ModelT1000(Hand hand, Leg leg, Head head, String color, int year, boolean soundEnabled) {
        super(hand, leg, head);
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public ModelT1000(String color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public void action() {
        getHead().calc();
        getHand().catchSomething();
        getLeg().go();
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("can play sound: " + soundEnabled);

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }

    public void dance() {
        System.out.println("T1000 is dancing");
    }
}
