package org.training.domain;

import java.util.LinkedHashSet;
import java.util.Set;

public class Talk {

    private String title;
    private String summary;
    private Set<Speaker> speakers;

    public Talk(String title, String summary) {
        this.title = title;
        this.summary = summary;
        speakers = new LinkedHashSet<Speaker>();
    }

    public Talk(String title, Set<Speaker> speakers) {
        this.title = title;
        this.speakers = speakers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Set<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Set<Speaker> speakers) {
        this.speakers = speakers;
    }


    public void addSpeaker(Speaker speaker){
        speakers.add(speaker);
    }

    @Override
    public String toString() {
        return "Talk{" +
                "title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", speakers=" + speakers +
                '}';
    }
}
