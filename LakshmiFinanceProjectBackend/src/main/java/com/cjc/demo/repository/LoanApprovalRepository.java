package com.cjc.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.demo.model.generalclasses.LoanApproval;

@Repository
public interface LoanApprovalRepository extends CrudRepository<LoanApproval, Integer>
{

}
