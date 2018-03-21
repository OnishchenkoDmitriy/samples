package org.training.service.impl;

import org.training.domain.Speaker;
import org.training.domain.Talk;
import org.training.repository.TalkRepo;
import org.training.service.TalkService;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SimpleTalkService implements TalkService {

    private TalkRepo talkRepo;

    public SimpleTalkService(TalkRepo talkRepo) {
        this.talkRepo = talkRepo;
    }

    @Override
    public void createTalk(String tittle, Speaker... speakers) {
        Set<Speaker> speakerSet = new HashSet<>(Arrays.asList(speakers));
        Talk talk = new Talk(tittle, speakerSet);
        talkRepo.save(talk);
    }

    @Override
    public List<Talk> getTalks() {
        return talkRepo.getTalks();
    }
}
