package com.renu.JobApp;
import com.renu.JobApp.repo.JobRepo;
import com.renu.JobApp.service.JobService;
import model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {
    @Autowired
    private JobRepo repo;
    @RequestMapping({"/", "home"})
    public String home(){
        return "home";
    }
    @GetMapping("addjob")
    public String addJob(){
        return "addjob";
    }
    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        service.addJob(jobPost);
        return "success";
    }

    @GetMapping("viewalljobss")
    public String viewJobs(){

        List<JobPost> jobs= service.getAllJobs();
        m.addAttribute(attributeValue:"jobPosts", jobs);
        return "viewalljobs";

    }
}
