package com.org.ibm.repository;

import com.org.ibm.model.EmpModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends MongoRepository<EmpModel,Integer> {
}
