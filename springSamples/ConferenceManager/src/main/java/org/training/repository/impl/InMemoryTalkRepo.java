package org.training.repository.impl;

import org.springframework.stereotype.Repository;
import org.training.domain.Talk;
import org.training.repository.TalkRepo;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryTalkRepo implements TalkRepo {

    private List<Talk> talks;

    @Override
    public List<Talk> getTalks() {
        return talks;
    }

    @Override
    public void save(Talk talk) {
        talks.add(talk);
    }

    public void init() {
        talks = new ArrayList<>();
    }

    public void close() {
        System.out.println("Close");
    }
}
