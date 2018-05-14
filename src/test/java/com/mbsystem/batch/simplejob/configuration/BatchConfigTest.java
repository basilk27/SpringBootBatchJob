package com.mbsystem.batch.simplejob.configuration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith( SpringRunner.class )
@SpringBootTest
public class BatchConfigTest {

    @MockBean
    private JobBuilderFactory jobBuilderFactory;

    @MockBean
    private StepBuilderFactory stepBuilderFactory;

    private BatchConfig batchConfig;

    @Before
    public void setUp() throws Exception {
        batchConfig = new BatchConfig(jobBuilderFactory, stepBuilderFactory);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void processJob() {
        assertThat( batchConfig ).isNotNull();
    }
}