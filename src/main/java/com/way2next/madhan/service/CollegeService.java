package com.way2next.madhan.service;

import com.way2next.madhan.collection.College;

import java.util.List;
import java.util.Optional;


public interface CollegeService {
    void save(College college);

    List<College> listAllCollge();

    Optional<College> findCollegeById(Integer id);
}
