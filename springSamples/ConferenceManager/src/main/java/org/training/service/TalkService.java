package org.training.service;

import org.training.domain.Speaker;
import org.training.domain.Talk;

import java.util.List;

public interface TalkService {

    void createTalk(String tittle, Speaker... speakers);
    List<Talk> getTalks();

}
