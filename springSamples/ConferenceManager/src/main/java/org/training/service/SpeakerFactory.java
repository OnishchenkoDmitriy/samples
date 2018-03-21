package org.training.service;

import org.training.domain.Speaker;

public class SpeakerFactory {

    public Speaker createSpeaker(String name, String surname){
        return new Speaker(name, surname);
    }

}
