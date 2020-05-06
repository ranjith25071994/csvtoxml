package com.hicap.springbatch;

import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class RunScheduler {
    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private Job job;

    public RunScheduler() {
    }

    public void run() {

        File f= new File("C:\\Users\\rperumalsamy\\OneDrive - IGT PLC\\Desktop\\SpringBatchCsvToXml\\SpringBatchCsvToXml\\xml\\RetailerDetails.xml");           //file to be delete
        if(f.delete() == true)                      //returns Boolean value
        {
            System.out.println(f.getName() + " deleted");   //getting and printing the file name
        }
        else
        {
            System.out.println(f.getName() + " not deleted");
        }

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-batch-context.xml");

        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("RetailerDetailsJob");

        try {
            JobExecution execution = jobLauncher.run(job, new JobParameters());
            System.out.println("Job Exit Status : "+ execution.getStatus());

        } catch (JobExecutionException e) {
            System.out.println("Job RetailerDetails failed");
            e.printStackTrace();
        }

    }
}
