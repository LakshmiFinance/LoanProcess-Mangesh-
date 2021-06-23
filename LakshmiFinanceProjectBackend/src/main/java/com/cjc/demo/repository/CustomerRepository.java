package com.cjc.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.cjc.demo.model.CustomerPersonalDetails;
@Repository
public interface CustomerRepository extends CrudRepository<CustomerPersonalDetails, Integer> {

}
