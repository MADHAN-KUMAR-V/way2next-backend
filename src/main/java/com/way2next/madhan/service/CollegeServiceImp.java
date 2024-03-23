package com.way2next.madhan.service;

import com.way2next.madhan.collection.College;
import com.way2next.madhan.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
    public Page<College> listAllCollge(int page, int size) {
        return collegeRepository.findAll(PageRequest.of(page, size, Sort.by("id")));
    }

    @Override
    public Optional<College> findCollegeById(Integer id) {
        return collegeRepository.findById(id);
    }

    @Override
    public Page<College> searchCollege(int page, int size, String name) {
        Page<College> filterCollege = collegeRepository.findAllByCollegeName(name,
                                                                    PageRequest.of(page,size,Sort.by("id")));
        return filterCollege;
    }
}
