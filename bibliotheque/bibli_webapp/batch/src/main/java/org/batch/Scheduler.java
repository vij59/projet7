package org.batch;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;


public class Scheduler {

    private static final Logger LOGGER = LogManager.getLogger(Scheduler.class);

    @Autowired
    private JobLauncher jobLauncher;


    @Autowired
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