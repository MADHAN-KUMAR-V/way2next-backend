package com.way2next.madhan.service;

import com.way2next.madhan.collection.College;
import org.springframework.data.domain.Page;

import java.util.Optional;


public interface CollegeService {
    void save(College college);

    Page<College> listAllCollge(int page, int size);

    Optional<College> findCollegeById(Integer id);
}
