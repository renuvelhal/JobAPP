package com.renu.JobApp.service;

import model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobService {
    @Autowired
    private JobService service;

    public void addJob(JobPost jobPost){
        service.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return service.getAllJobs();

    }
}

