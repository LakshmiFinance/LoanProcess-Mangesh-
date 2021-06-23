package com.cjc.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.demo.model.generalclasses.LoanEmiCalculation;

@Repository
public interface LoanEmiRepository extends CrudRepository<LoanEmiCalculation, Integer>
{

}
