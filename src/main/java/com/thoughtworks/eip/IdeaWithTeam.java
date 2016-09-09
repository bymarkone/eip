package com.thoughtworks.eip;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class IdeaWithTeam {
    private Idea idea;
    private Team team;
}
