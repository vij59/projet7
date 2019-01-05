package org.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Scheduler3 {
    @Autowired
    private JobLauncher jobLauncher;


    @Autowired
    @Qualifier("scheduledJob3")
    private Job job;

    public void run() {
        JobParameters parameters = new JobParametersBuilder()
                .addLong("currentTime", System.currentTimeMillis())
                .toJobParameters();

        try {
            jobLauncher.run(job, parameters);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}