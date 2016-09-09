package com.thoughtworks.eip;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class MVP {
    private IdeaWithTeam ideaWithTeam;
    private List<Feature> features;
}
