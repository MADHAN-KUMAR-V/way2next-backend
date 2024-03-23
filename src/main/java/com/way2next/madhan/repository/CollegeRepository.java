package com.way2next.madhan.repository;

import com.way2next.madhan.collection.College;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepository extends MongoRepository<College,Integer> {
    @Query("{'collegeName': { $regex: ?0, $options: 'i' } }")
    Page<College> findAllByCollegeName(String name, PageRequest id);
}
