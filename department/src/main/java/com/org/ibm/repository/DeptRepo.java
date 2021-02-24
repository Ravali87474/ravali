package com.org.ibm.repository;

import com.org.ibm.model.DeptModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptRepo extends MongoRepository<DeptModel,Integer> {
}
