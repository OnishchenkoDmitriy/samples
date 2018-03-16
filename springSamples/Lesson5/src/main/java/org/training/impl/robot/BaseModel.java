package org.training.impl.robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.training.interfaces.Hand;
import org.training.interfaces.Head;
import org.training.interfaces.Leg;
import org.training.interfaces.Robot;

public abstract class BaseModel implements Robot {

    @Autowired
    private Hand hand;
    @Autowired
    private Leg leg;
    @Autowired
    private Head head;

    public BaseModel() {
        System.out.println(this + " - ModelT500 constructor()");
    }

    public BaseModel(Hand hand, Leg leg, Head head) {
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }
}
