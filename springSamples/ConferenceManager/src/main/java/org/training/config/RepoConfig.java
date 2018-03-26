package org.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.training.repository.TalkRepo;
import org.training.repository.impl.InMemoryTalkRepo;

@Configuration
@ComponentScan(basePackages = "org.training")
public class RepoConfig {


    @Bean(initMethod = "init", destroyMethod = "close")
    public TalkRepo talkRepo(){
        return new InMemoryTalkRepo();
    }
}
