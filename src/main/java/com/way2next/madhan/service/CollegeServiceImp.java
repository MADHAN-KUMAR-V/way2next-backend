package com.way2next.madhan.service;

import com.way2next.madhan.collection.College;
import com.way2next.madhan.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CollegeServiceImp implements CollegeService{
    @Autowired
    private CollegeRepository collegeRepository;
    @Override
    public void save(College college) {
        collegeRepository.save(college);
    }

    @Override
    public List<College> listAllCollge() {
        return collegeRepository.findAll();
    }

    @Override
    public Optional<College> findCollegeById(Integer id) {
        return collegeRepository.findById(id);
    }
}
