package org.training.impl.robot;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.training.impl.ColorStyle;
import org.training.interfaces.Hand;
import org.training.interfaces.Head;
import org.training.interfaces.Leg;

@Component
public class ModelT1000 extends BaseModel{

    private ColorStyle color;
    private int year;
    private boolean soundEnabled;

    public ModelT1000() {
    }

    public ModelT1000(Hand hand, Leg leg, Head head) {
        super(hand, leg, head);
    }

    public ModelT1000(Hand hand, Leg leg, Head head, ColorStyle color, int year, boolean soundEnabled) {
        super(hand, leg, head);
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public ModelT1000(ColorStyle color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ModelT1000 model_1(){
        return new ModelT1000();
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ModelT1000 model_2(){
        return new ModelT1000(ColorStyle.BLACK, 2005, true);
    }

    public void action() {
        getHead().calc();
        getHand().catchSomething();
        getLeg().go();
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("can play sound: " + soundEnabled);

    }

    public ColorStyle getColor() {
        return color;
    }

    public void setColor(ColorStyle color) {
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
