package org.training.config;

import org.springframework.context.annotation.*;
import org.training.domain.Talk;
import org.training.repository.TalkRepo;
import org.training.service.TalkService;
import org.training.service.impl.SimpleTalkService;

@Configuration
//@Import(value = RepoConfig.class)
public class ServiceConfig {

    @Scope("prototype")
    @Bean
    public Talk talk(){
        return new Talk();
    }
    @Bean
    public TalkService talkService(TalkRepo talkRepo){
        return new SimpleTalkService(talkRepo){

        };
    }
}
