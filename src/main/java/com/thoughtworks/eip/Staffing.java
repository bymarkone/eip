package com.thoughtworks.eip;

import org.springframework.stereotype.Component;

@Component
public class Staffing {
    public IdeaWithTeam buildTeam(Idea idea) {
        return IdeaWithTeam.builder().idea(new Idea()).team(new Team()).build();
    }

    public void modifyTeam() {
        System.out.println("time modificado");
    }
}
