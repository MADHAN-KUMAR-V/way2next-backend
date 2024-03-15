package com.way2next.madhan.repository;

import com.way2next.madhan.collection.College;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepository extends MongoRepository<College,Integer> {
}
