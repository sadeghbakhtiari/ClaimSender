package com.asgarie.ClaimSender.batch;

import com.asgarie.ClaimSender.entity.User;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Component
public class UserJobTest extends JobExecutionListenerSupport{

    @Autowired
    JobBuilderFactory jobBuilderFactory;

    @Autowired
    StepBuilderFactory stepBuilderFactory;

    @Autowired
    Reader reader;

    @Autowired
    Processor processor;

    @Autowired
    Writer writer;

    @Bean(name = "userJob")
    public Job userJob() {

        Step step = stepBuilderFactory.get("step-1")
                .<User, User> chunk(1)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .build();

        Job job = jobBuilderFactory.get("user-job")
                .incrementer(new RunIdIncrementer())
                .listener(this)
                .start(step)
                .build();

        return job;
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
            System.out.println("BATCH JOB COMPLETED SUCCESSFULLY");
        }
    }


}
