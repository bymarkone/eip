package com.thoughtworks.eip;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.core.Is.is;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ProjectSimulatorTest {

    @Autowired
    private ProjectSimulator projectSimulator;

    @Test
    public void simulateAProject() {
        MVP simulate = projectSimulator.simulate(new Idea());
        assertThat(simulate, is(instanceOf(MVP.class)));
    }

}