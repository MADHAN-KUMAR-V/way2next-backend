package com.way2next.madhan.controller;

import com.way2next.madhan.collection.College;
import com.way2next.madhan.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/college")
@CrossOrigin(origins = "http://localhost:3000/")
public class CollegeController {

    @Autowired
    private CollegeService collegeService;
    @PostMapping
    public void save(@RequestBody College college){
        collegeService.save(college);
    }

    @GetMapping
    public List<College> listAllCollege(){
        return collegeService.listAllCollge();
    }
    @GetMapping("/{id}")
    public Optional<College> findCollegeById(@PathVariable Integer id){
        return collegeService.findCollegeById(id);
    }
    @GetMapping("/greet")
    public String greet(){
        return "working";
    }
}
