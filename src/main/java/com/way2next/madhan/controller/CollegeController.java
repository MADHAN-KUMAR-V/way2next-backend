package com.way2next.madhan.controller;

import com.way2next.madhan.collection.College;
import com.way2next.madhan.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/college")
@CrossOrigin(origins = "https://app-way2next.onrender.com/")
public class CollegeController {

    @Autowired
    private CollegeService collegeService;
    @PostMapping
    public void save(@RequestBody College college){
        collegeService.save(college);
    }

    @GetMapping
    public Page<College> listAllCollege(@RequestParam(value = "page" ,defaultValue = "0") int page,
                                              @RequestParam(value = "size",defaultValue = "5") int size){
        return collegeService.listAllCollge(page,size);
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
