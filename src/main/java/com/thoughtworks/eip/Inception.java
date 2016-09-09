package com.thoughtworks.eip;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Inception {
    public MVP toThePoint(IdeaWithTeam ideaWithTeam) {
        return MVP.builder().ideaWithTeam(ideaWithTeam).features(new ArrayList<>()).build();
    }
}
