package org.training.repository;

import org.training.domain.Talk;

import java.util.List;

public interface TalkRepo {
    List<Talk> getTalks();

    void save(Talk talk);
}
