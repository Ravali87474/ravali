package com.org.ibm.repository;

import com.org.ibm.model.EmpAndDeptModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpAndDeptRepo extends MongoRepository<EmpAndDeptModel,Integer> {
}
